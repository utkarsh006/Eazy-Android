Android architecture is a software stack of components to support mobile device needs. Android software stack contains a Linux Kernel, collection of c/c++ libraries which are exposed through an application framework services, runtime, and application.

 

Following are main components of android architecture those are

 

Applications
Android Framework
Android Runtime
Platform Libraries
Linux Kernel
In these components, the Linux Kernel is the main component in android to provide its operating system functions to mobile and Dalvik Virtual Machine (DVM) which is responsible for running a mobile application.

 

Following is the pictorial representation of android architecture with different components.

 

Android Architecture Diagram with Multiple Components

Applications
The top layer of the android architecture is Applications. The native and third-party applications like contacts, email, music, gallery, clock, games, etc. whatever we will build those will be installed on this layer only.

 

The application layer runs within the Android run time using the classes and services made available from the application framework. 

Application Framework
The Application Framework provides the classes used to create Android applications. It also provides a generic abstraction for hardware access and manages the user interface and application resources. It basically provides the services through which we can create a particular class and make that class helpful for the Application creation.

 

The application framework includes services like telephony service, location services, notification manager, NFC service, view system, etc. which we can use for application development as per our requirements.

Android Runtime
Android Runtime environment is an important part of Android rather than an internal part and it contains components like core libraries and the Dalvik virtual machine. The Android run time is the engine that powers our applications along with the libraries and it forms the basis for the application framework.

 

Dalvik Virtual Machine (DVM) is a register-based virtual machine like Java Virtual Machine (JVM). It is specially designed and optimized for android to ensure that a device can run multiple instances efficiently. It relies on the Linux kernel for threading and low-level memory management.

 

The core libraries in android runtime will enable us to implement android applications using standard JAVA programming language.

Platform Libraries
The Platform Libraries includes various C/C++ core libraries and Java-based libraries such as SSL, libc, Graphics, SQLite, Webkit, Media, Surface Manger, OpenGL, etc. to provide support for Android development.

 

The following are the summary details of some core android libraries available for android development.

 

Media library for playing and recording audio and video formats
The Surface manager library to provide a display management
SGL and OpenGL Graphics libraries for 2D and 3D graphics
SQLite is for database support and FreeType for font support
Web-Kit for web browser support and SSL for Internet security.
Linux Kernel
Linux Kernel is a bottom layer and heart of the android architecture. It manages all the drivers such as display drivers, camera drivers, Bluetooth drivers, audio drivers, memory drivers, etc. which are mainly required for the android device during the runtime.

 

The Linux Kernel will provide an abstraction layer between the device hardware and the remainder of the stack. It is responsible for memory management, power management, device management, resource access, etc.