$(document).ready(function() {
	
	ajaxGet();
	loadCities();
	
	// DO GET
	function ajaxGet(){
		$.ajax({
			type : "GET",
			url : "/atmLocations",
			success: function(result){
				$.each(result, function(i, atmlocation){
					
					var customerRow = '<tr>' +
										'<td>' + atmlocation.address.street + '</td>' +
										'<td>' + atmlocation.address.housenumber + '</td>' +
										'<td>' + atmlocation.address.postalcode + '</td>' +
										'<td>' + atmlocation.address.city + '</td>' +
										'<td>' + atmlocation.address.geoLocation.lat + '</td>' +
										'<td>' + atmlocation.address.geoLocation.lng + '</td>' +
										'<td>' + atmlocation.distance + '</td>' +
										'<td>' + atmlocation.type + '</td>' +
									  '</tr>';
					
					$('#atmLocations tbody').append(customerRow);
					
		        });
				
				$( "#customerTable tbody tr:odd" ).addClass("info");
				$( "#customerTable tbody tr:even" ).addClass("success");
			},
			error : function(e) {
				console.log("ERROR: ", e);
			}
		});	
	}
	function loadCities(){
		$.ajax({
			type : "GET",
			url : "/cities",
			success: function(result){
				$.each(result, function(i, city){
					
					var option = '<option value='+city+'>'+ city +'</option>';
					
					//$('#cities').append(option);
					
		        });
			},
			error : function(e) {
				console.log("ERROR: ", e);
			}
		});	
	}
})