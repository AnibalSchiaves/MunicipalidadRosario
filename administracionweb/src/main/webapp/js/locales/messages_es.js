/*
 * Translated default messages for the jQuery validation plugin.
 * Locale: ES (Spanish; Español)
 */
(function ($) {
	$.extend($.validator.messages, {
		required: "Este campo es obligatorio.",
		remote: "Por favor, rellena este campo.",
		email: "Por favor, escribe una dirección de correo válida",
		url: "Por favor, escribe una URL v&aacute;lida.",
		date: "Por favor, escribe una fecha v&aacute;lida.",
		dateISO: "Por favor, escribe una fecha (ISO) v&aacute;lida.",
		number: "Por favor, escribe un n&uacute;mero entero v&aacute;lido.",
		digits: "Por favor, escribe s&oacute;lo d&iacute;gitos.",
		creditcard: "Por favor, escribe un n&uacute;mero de tarjeta v&aacute;lido.",
		equalTo: "Por favor, escribe el mismo valor de nuevo.",
		accept: "Por favor, escribe un valor con una extensión aceptada.",
		lettersonly: "Por favor, escribe s&oacute;lo letras",
		maxlength: $.validator.format("Por favor, no escribas m&aacute;s de {0} caracteres."),
		minlength: $.validator.format("Por favor, no escribas menos de {0} caracteres."),
		rangelength: $.validator.format("Por favor, escribe un valor entre {0} y {1} caracteres."),
		range: $.validator.format("Por favor, escribe un valor entre {0} y {1}."),
		max: $.validator.format("Por favor, escribe un valor menor o igual a {0}."),
		min: $.validator.format("Por favor, escribe un valor mayor o igual a {0}.")
	});
}(jQuery));