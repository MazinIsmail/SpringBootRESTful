package com.springRESTful.naming;

import org.springframework.stereotype.Component;

/**
 * REST Resource Naming Guide
 * 
 * In REST, primary data representation is called Resource.
 * 
 * A resource can be a singleton or a collection. For example, “customers” is a
 * collection resource and “customer” is a singleton resource (in a banking
 * domain). We can identify “customers” collection resource using the URI
 * “/customers”. We can identify a single “customer” resource using the URI
 * “/customers/{customerId}”.
 * 
 * A resource may contain sub-collection resources also. For example,
 * sub-collection resource “accounts” of a particular “customer” can be
 * identified using the URN “/customers/{customerId}/accounts” (in a banking
 * domain). Similarly, a singleton resource “account” inside the sub-collection
 * resource “accounts” can be identified as follows:
 * “/customers/{customerId}/accounts/{accountId}”.
 * 
 * REST Resource Naming Best Practices:-
 * 
 * 1. Use nouns to represent resources:-
 * 
 * For more clarity, let’s divide the resource archetypes into four categories
 * (document, collection, store and controller) and then you should always
 * target to put a resource into one archetype and then use it’s naming
 * convention consistently. For uniformity’s sake, resist the temptation to
 * design resources that are hybrids of more than one archetype.
 * 
 * 1.1 Document: A document resource is a singular concept that is akin to an
 * object instance or database record. In REST, you can view it as a single
 * resource inside resource collection. A document’s state representation
 * typically includes both fields with values and links to other related
 * resources.
 * 
 * Use “singular” name to denote document resource archetype.
 * 
 * http://api.example.com/device-management/managed-devices/{device-id}
 * http://api.example.com/user-management/users/{id}
 * http://api.example.com/user-management/users/admin
 * 
 * 1.2 Collection: A collection resource is a server-managed directory of
 * resources. Clients may propose new resources to be added to a collection.
 * However, it is up to the collection to choose to create a new resource or
 * not. A collection resource chooses what it wants to contain and also decides
 * the URIs of each contained resource.
 * 
 * Use the “plural” name to denote the collection resource archetype.
 * 
 * http://api.example.com/device-management/managed-devices
 * http://api.example.com/user-management/users
 * http://api.example.com/user-management/users/{id}/accounts
 * 
 * 1.3 Store: A store is a client-managed resource repository. A store resource
 * lets an API client put resources in, get them back out, and decide when to
 * delete them. A store never generates new URIs. Instead, each stored resource
 * has a URI. The URI was chosen by a client when it was initially put into the
 * store.
 * 
 * Use “plural” name to denote store resource archetype.
 * 
 * http://api.example.com/song-management/users/{id}/playlists
 * 
 * 1.4 Controller: A controller resource models a procedural concept. Controller
 * resources are like executable functions, with parameters and return values;
 * inputs and outputs.
 * 
 * Use “verb” to denote controller archetype.
 * 
 * http://api.example.com/cart-management/users/{id}/cart/checkout
 * http://api.example.com/song-management/users/{id}/playlist/play
 * 
 * 2. Consistency is the key:-
 * 
 * 2.1 Use forward slash (/) to indicate hierarchical relationships:
 * 
 * http://api.example.com/device-management
 * http://api.example.com/device-management/managed-devices
 * http://api.example.com/device-management/managed-devices/{id}
 * http://api.example.com/device-management/managed-devices/{id}/scripts
 * http://api.example.com/device-management/managed-devices/{id}/scripts/{id}
 * 
 * 2.2 Do not use trailing forward slash (/) in URIs:
 * 
 * http://api.example.com/device-management/managed-devices/
 * 
 * This is much better version
 * http://api.example.com/device-management/managed-devices
 * 
 * 2.3 Use hyphens (-) to improve the readability of URIs:
 * 
 * More readable
 * http://api.example.com/inventory-management/managed-entities/{id}/install-script-location
 * 
 * Less readable
 * http://api.example.com/inventory-management/managedEntities/{id}/installScriptLocation
 * 
 * 2.4 Do not use underscores ( _ ):
 * 
 * More readable
 * http://api.example.com/inventory-management/managed-entities/{id}/install-script-location
 * 
 * More error prone
 * http://api.example.com/inventory_management/managed_entities/{id}/install_script_location
 * 
 * 2.5 Use lowercase letters in URIs:
 * 
 * When convenient, lowercase letters should be consistently preferred in URI
 * paths. RFC 3986 defines URIs as case-sensitive except for the scheme and host
 * components.
 * 
 * http://api.example.org/my-folder/my-doc //1
 * HTTP://API.EXAMPLE.ORG/my-folder/my-doc //2
 * http://api.example.org/My-Folder/my-doc //3
 * 
 * In above examples, 1 and 2 are same but 3 is not as it uses My-Folder in
 * capital letters.
 * 
 * 2.6 Do not use file extentions:
 * 
 * if you want to highlight the media type of API using file extenstion then you
 * should rely on the media type, as communicated through the Content-Type
 * header, to determine how to process the body’s content.
 * 
 * Do not use it
 * 
 * http://api.example.com/device-management/managed-devices.xml
 * 
 * This is correct URI
 * 
 * http://api.example.com/device-management/managed-devices
 * 
 * 2.7 Never use CRUD function names in URIs:
 * 
 * URIs should not be used to indicate that a CRUD function is performed. URIs
 * should be used to uniquely identify resources and not any action upon them.
 * HTTP request methods should be used to indicate which CRUD function is
 * performed.
 * 
 * HTTP GET http://api.example.com/device-management/managed-devices //Get all
 * devices
 * 
 * HTTP POST http://api.example.com/device-management/managed-devices //Create
 * new Device
 * 
 * HTTP GET http://api.example.com/device-management/managed-devices/{id} //Get
 * device for given Id
 * 
 * HTTP PUT http://api.example.com/device-management/managed-devices/{id}
 * //Update device for given Id
 * 
 * HTTP DELETE http://api.example.com/device-management/managed-devices/{id}
 * //Delete device for given Id
 * 
 * 2.8 Use query component to filter URI collection:
 * 
 * Many times, you will come across requirements where you will need a
 * collection of resources sorted, filtered or limited based on some certain
 * resource attribute. For this, do not create new APIs – rather enable sorting,
 * filtering and pagination capabilities in resource collection API and pass the
 * input parameters as query parameters.
 * 
 * http://api.example.com/device-management/managed-devices
 * http://api.example.com/device-management/managed-devices?region=USA
 * http://api.example.com/device-management/managed-devices?region=USA&brand=XYZ
 * http://api.example.com/device-management/managed-devices?region=USA&brand=XYZ&sort=installation-date
 */
@Component
public class SpringRESTfulNaming {

}
