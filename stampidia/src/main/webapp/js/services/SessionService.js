/**
 * @ngdoc controller
 * @name stampidia.LoginController
 * @description # LoginController Controlador encargado del login/logout
 */
(function() {
    'use strict';
    
    /**
     * Servicio encargado de mantener la información del usuario que se encuentra actualmente logueado
     */
    var SessionService = function() {
	this.create = function(authId, authToken, authPermission, id) {
	    this.authId = authId;
	    this.authToken = authToken;
	    this.authPermission = authPermission;
	    this.id = id;
	};
	this.destroy = function() {
	    this.authId = null;
	    this.authToken = null;
	    this.authPermission = null;
	};
	return this;
    };
    angular.module('stampidia.services').factory('sessionService', [ SessionService ]);
}());