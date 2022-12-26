## REST
- Representational State Transfer (REST) is a software architecture that imposes conditions on how an API should work.
- When any application/architecture follow guiding principles of REST it is said to be **RESTFUL**.
- REST != HTTP

## 6 Guiding Principles of REST
- **1. Uniform Interface :** By applying the [Principle of generality](https://www.d.umn.edu/~gshute/softeng/principles.html) to the components interface, we can simplify the overall system architecture and improve the visibility 
of interactions. Multiple architectural constraints help in obtaining a uniform interface and guiding the behavior of components.

The following **four constraints** can achieve a uniform REST interface:

   - **Identification of resources:** The interface must uniquely identify each resource involved in the interaction between the client and the server.
   - **Manipulation of resources through representations:** The resources should have uniform representations in the server response. API consumers should use these representations to modify the resources state in the server.
   - **Self-descriptive messages:** Each resource representation should carry enough information to describe how to process the message. It should also provide information of the additional actions that the client can perform on the resource.
   - **Hypermedia as the engine of application state:** The client should have only the initial URI of the application. The client application should dynamically drive all other resources and interactions with the use of hyperlinks.


- **2. Client-Server :** The client-server design pattern enforces the separation of concerns, which helps the client and the server components evolve independently. <br>
By separating the user interface concerns (client) from the data storage concerns (server), we improve the portability of the user interface across multiple platforms and improve scalability by simplifying the server components. <br>
While the client and the server evolve, we have to make sure that the interface/contract between the client and the server does not break.

- **3. Stateless :** [Statelessness](https://restfulapi.net/statelessness/) mandates that each request from the client to the server must contain all of the information necessary to understand and complete the request. <br>
 **Current state need not have any information about the previous state.** For this reason, the client application must entirely keep the session state.
 
- **4. Cacheable :** The cacheable constraint requires that a response should implicitly or explicitly label itself as cacheable or non-cacheable. <br>
If the response is cacheable, the client application **gets the right to reuse** the response data later for equivalent requests and a specified period.

- **5. Layered System :** The layered system style allows an architecture to be **composed of hierarchical layers** by constraining component behavior.
       **Ex:** In a layered system, each component cannot see beyond the immediate layer they are interacting with.
       
- **6. Code On Demand :** REST also allows client functionality to extend by downloading and executing code in the form of applets or scripts. <br>
The downloaded code simplifies clients by **reducing the number of features** required to be pre-implemented. <br> Servers can provide part of features delivered to the client in the form of code, and the client only needs to execute the code.

<br>

## Resource 
The key abstraction of information in REST is a resource. Any information that **we can name** can be a resource. **Ex :** A REST resource can be a document or image, a temporal service, a collection of other resources, or a non-virtual object (a person). <br> The state of the resource, at any particular time, is known as the **resource representation.** <br>

```https://facebook.com/{Resource}```
- This Resource can be messages, user_id etc.

<br>

<div align="right">
   <a href="https://github.com/utkarsh006/Eazy-Android/blob/main/Articles/Rest%20Methods.md">READ NEXT ARTICLE</a> </div>
