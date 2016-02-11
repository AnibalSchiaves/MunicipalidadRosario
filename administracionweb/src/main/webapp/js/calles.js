//var urlBase = /*[[${#httpServletRequest.contextPath}]]*/ '';
				
//				var urlSearchCalle = urlBase + '/domicilio/searchCalle.htm?q=%QUERY';
//				var urlSearchLocalidad = urlBase + '/domicilio/searchLocalidad.htm?q=%QUERY';
				
				function initTypeAheadCalles(tipo, urlSearchCalle) {
					if ( $('[id^= "' + tipo + 'codigoPostal"]').val() == 2000 ) {
						$('[id^= "' + tipo + 'calle"]').typeahead({
							  name: 'calles',
							  valueKey: 'nombre',
							  remote: urlSearchCalle,
							  template: '<p><strong>{{nombre}}</strong></p>',
							  engine: Hogan,
							  limit: 10
							}).on('typeahead:opened', function() {
						    	$(this).closest('.panel-default').css('overflow','visible');
							}).on('typeahead:closed', function() {
								$(this).closest('.panel-default').css('overflow','hidden');
							}).on('typeahead:selected', function(evt, item) {
								////var tipo = $(this).prop('id').slice(5);
								$('[id^="' + tipo + 'codigoCalle"]').val(item.id);
							}).on('keyup', function() {
								////var tipo = $(this).prop('id').slice(5);
								if ($('[id^="' + tipo + 'calle"]').val() == '') {
									$('[id^="' + tipo + 'codigoCalle"]').val('');
								}
							});
						
						$('.tt-hint').addClass('form-control');
						//$('.tt-hint').addClass('correctCase');
					} else {
						$("[id='" + tipo + "calle']").typeahead('destroy');
					}

				}
				
				function initTypeAheadLocalidades(tipo, urlSearchCalle, urlSearchLocalidad) {
					$('[id^="' + tipo + 'localidad"]').typeahead({
						  name: 'localidades',
						  valueKey: 'descripcion',
						  remote: urlSearchLocalidad,
						  template: '<p><strong>{{descripcion}}</strong> - {{provincia.descripcion}} - {{idLocalidad.codPostal}}</p>',
						  engine: Hogan,
						  limit: 10
						}).on('typeahead:opened', function() {
					    	$(this).closest('.panel-default').css('overflow','visible');
						}).on('typeahead:closed', function() {
							$(this).closest('.panel-default').css('overflow','hidden');
						}).on('typeahead:selected', function(evt, item) {
							//var tipo = $(this).prop('id').slice(9);
					//		$('#provincia_' + dirType).html(item.provincia.descripcion);
					//		$('#codPostal').html(item.idLocalidad.codPostal);
							$('[id^="' + tipo + 'codigoPostal"]').val(item.idLocalidad.codPostal);
							$('[id^="' + tipo + 'codigoSubPostal"]').val(item.idLocalidad.subPostal);
							
							
							initTypeAheadCalles(tipo, urlSearchCalle);
							
						}).on('keyup', function() {
							////var tipo = $(this).prop('id').slice(9);
							if (this.value == '') {
								$('[id^="' + tipo + 'codigoPostal"]' ).val('');
								$('[id^="' + tipo + 'codigoSubPostal"]').val('');
							}
						});
						
						$('.tt-hint').addClass('form-control');
					
				}				
				