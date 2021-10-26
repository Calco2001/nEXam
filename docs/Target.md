# nEXam - Software Requirements Specification 

## Table of contents
- [Table of contents](#table-of-contents)
- [Introduction](#1-introduction)
    - [Purpose](#11-purpose)
    - [Scope](#12-scope)
    - [Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
    - [References](#14-references)
    - [Overview](#15-overview)
- [Overall Description](#2-overall-description)
    - [Vision](#21-vision)
    - [Use Case Diagram](#22-use-case-diagram)
	- [Technology Stack](#23-technology-stack)
- [Specific Requirements](#3-specific-requirements)
    - [Functionality](#31-functionality)
    - [Usability](#32-usability)
    - [Reliability](#33-reliability)
    - [Performance](#34-performance)
    - [Supportability](#35-supportability)
    - [Design Constraints](#36-design-constraints)
    - [Online User Documentation and Help System Requirements](#37-on-line-user-documentation-and-help-system-requirements)
    - [Purchased Components](#purchased-components)
    - [Interfaces](#39-interfaces)
    - [Licensing Requirements](#310-licensing-requirements)
    - [Legal, Copyright And Other Notices](#311-legal-copyright-and-other-notices)
    - [Applicable Standards](#312-applicable-standards)
- [Supporting Information](#4-supporting-information)

## 1. Introduction

### 1.1 Purpose
This Software Requirements Specification (SRS) describes all specifications for the application "nEXam". It includes an overview about this project and its vision, detailed information about the planned features and boundary conditions of the development process.


### 1.2 Scope
The project is going to be realized as an Android and iOs App. The planned scope till end of december is shown in the [use-case specification](https://github.com/Calco2001/nEXam/blob/main/docs/Use-Case%20Specification.md#1-use-case).

<!--*<!--Actors of this App can be users or moderators.*-->

<!--*Planned Subsystems are:*--> 

<!--*Notice Board:  
The notice board is the essential part of the user interface. Game sessions should be visualized as postings including relevant information about the session. Those should be partly standardized by a form with a free text option for specifics. The data must be stored accordingly.*-->

<!--*Account System:  
Users can create accounts so sessions can be connected to a person as well as to join requests. User data must be stored alongside the posting data.*-->

<!--*Friend List and User Rating:  
Once the account system is created there will be the option to mark users as favorites. Also users or game sessions should get a rating to counter abuse.*-->

<!--*Connecting People:  
The host of a game session has to be notified when someone wants to join their game. Both must then be able to get in touch to organize the details, so messages between the host and the guest have to be enabled. This could be done via automated emails or a custom in-app system. For this an account system is needed.*-->

<!--*Storing Data:  
User data for accounts and possibly profiles has to be stored. Also the game sessions have to be stored as datasets containing the form contents and possibly contact data. The data storage will form the foundation for the visualization, account system and the search feature.*-->

<!--*Finding your Game:  
We need a tag system so everyone looking to join a game can search for the kind of games they are interested in. Possibly other aspects can be searchable, such as place or date. Tags must be stored and a search function developed.*--> 

### 1.3 Definitions, Acronyms and Abbreviations
| Abbrevation | Explanation                         |
| ----------- | ----------------------------------- |
| SRS         | Software Requirements Specification |
| UC          | Use Case                            |
| n/a         | not applicable                      |
| tbd         | to be determined                    |
| UCD         | overall Use Case Diagram            |
| FAQ         | Frequently asked Questions          |

### 1.4 References

| Title                                               |    Date    | Publishing organization |
| --------------------------------------------------- | :--------: | ----------------------- |
| [nEXam blog](https://nexam955203221.wordpress.com/) | 18.10.2018 | nEXam-Team              |
| [GitHub](https://github.com/Calco2001/nEXam)        | 18.10.2018 | nEXam-Team              |


### 1.5 Overview
The following chapter provides an overview of this project with vision and Overall Use Case Diagram. The third chapter (Requirements Specification) delivers more details about the specific requirements in terms of functionality, usability and design parameters. Finally there is a chapter with supporting information. 
    
## 2. Overall Description

### 2.1 Vision

“nEXam” will be an app which helps you plan out when you should start learning before an exam and how much time you should spend learning. 

How does it work?
You need to enter your exam information, including date, subject and  topic. Based on this information the app will create an agenda when you  should study which topic. While studying you can run the in app timer,  so the app will change the background color of the topic to visualise  what has already been learned. Also you should be able to export the  iCal file to import it in your calendar of choice.

### 2.2 Use Case Diagram

![OUCD](https://github.com/Calco2001/nEXam/blob/main/docs/use%20case%20diagram.jpg)

- Green: Planned till end of december

  <!--Yellow: Planned till end of june-->

### 2.3 Technology Stack
The app should be available on iOS and Android.

We all agreed to use VS Code as our IDE because it gives us more  flexibility to use other programming languages (if needed) in the same  application. Yes we have to adjust and customize the VS Code a bit, but  we think that’s fine. Some of us have also had great experiences with  the ‘Live Share’ extension, which allows us to work on code together and simultaneously. This is usefull when more than one person is working on a topic or someone needs help. 

As we mentioned in our first blog we will use Kotlin and SQLite. 

The main argument why we will use Kotlin (even if nobody has any  experience with it) is usability. With Kotlin we are able to create the  front- and backend, also Kotlin provides us with the possibility to  develop the app for Android and iOS without a huge additional workload.

We will use SQLite to store some data. Our goal would be to not need a large database and store all the data we need on the client. There will be no need to ‘work’ with the client’s data and everything should be  able to run only on the user’s device. 

## 3. Specific Requirements

### 3.1 Functionality
This section will explain the different use cases, you could see in the Use Case Diagram, and their functionality.  
Until December we plan to implement:

<!--TODO: Add infos for planned use cases-->

*3.1.1 Create exams*

The creation of a new exam, where the users will be asked about the topic, subject, content and date.

*3.1.2 Add topics*

The user can 

*3.1.3 Edit info*

*3.1.4 Show agenda*

*3.1.5 Calendar*

<!--Until June, we want to implement:-->

<!--*3.1.6 Joining a session*-->

<!--*3.1.7 Keeping track of your sessions*-->

<!--*3.1.8 Leaving a session*-->

<!--*3.1.9 Finding a session*-->

<!--*3.1.10 Getting in touch*-->

### 3.2 Usability
We plan on designing the user interface as intuitive and self-explanatory as possible to make the user feel as comfortable as possible using the app. Though an FAQ document will be available, it should not be necessary to use it.

#### <!--3.2.1 No training time needed-->
<!--Our goal is that a user installs the android application, opens it and is able to use all features without any explanation or help.-->

#### <!--3.2.2 Familiar Feeling-->
<!--We want to implement an app with familiar designs and functions. This way the user is able to interact in familiar ways with the app without having to get to know new interfaces.-->

### 3.3 Reliability

#### <!--3.3.1 Availability-->
<!--The server shall be available 95% of the time. This also means we have to figure out the "rush hours" of our app because the downtime of the server is only tolerable when as few as possible players want to use the app.-->

#### <!--3.3.2 Defect Rate-->
<!--Our goal is that we have no loss of any data. This is important so that the game sessions can carry on, even after a downtime of the server.-->

### <!--3.4 Perfomance-->

#### <!--3.4.1 Capacity-->
<!--The system should be able to manage thousands of requests. Also it should be possible to register as many users as necessary.-->

#### <!--3.4.2 Storage--> 
<!--Smartphones don't provide much storage. Therefore we are aiming to keep the needed storage as small as possible.-->

#### <!--3.4.3 App perfomance / Response time-->
<!--To provide the best App perfomance we aim to keep the response time as low as possible. This will make the user experience much better.-->

### 3.5 Supportability

#### <!--3.5.1 Coding Standards-->
<!--We are going to write the code by using all of the most common clean code standards. For example we will name our variables and methods by their functionalities. This will keep the code easy to read by everyone and make further developement much easier.-->

#### <!--3.5.2 Testing Strategy-->
<!--The application will have a high test coverage and all important functionalities and edge cases should be tested. Further mistakes in the implementation will be discovered instantly and it will be easy to locate the error.--> 

### 3.6 Design Constraints
<!--We are trying to provide a modern and easy to handle design for the UI aswell as for the architecture of our application. To achieve that the functionalities will be kept as modular as possible.-->

<!--Because we are progamming an Android App we chose Java as our programming language. Also we are using the common MVC-architecture to keep the front end and back end seperated. For a clean front end structure we use MVVM.-->
<!--To make the communication between the two parts easy, we will implement a RESTful-API between them which will provide the data in JSON-Format.--> 
<!--The supported Platforms will be:-->

<!--Android 4.4 and higher-->

<!--Java 8 and higher-->

### 3.7 On-line User Documentation and Help System Requirements
<!--The usage of the app should be as intuitive as possible so it won't need any further documentation. If the user needs some help we will implement a "Help"-Button in the App which includes a FAQ and a formular to contact the developement team.-->

### 3.8 Purchased Components
<!--We don't have any purchased components yet. If there will be purchased components in the future we will list them here.-->

### 3.9 Interfaces

#### <!--3.9.1 User Interfaces-->
<!--The User interfaces that will be implented are:-->

<!--Dashboard - lists all session and makes it possible to filter sessions-->

<!--Session Page - shows detailed information about the session and makes it possible to connect session attendants for example via messaging system-->

<!--Login - this page is used to log in--> 

<!--Register - provides a registration form-->

<!--Overwiew of personal sessions - shows all the sessions a user participates in-->

<!--Friend List - friends can be added-->

<!--Profile - makes it possible to post information about yourself, might provide messaging feature, also shows additional information about users (for example: Language, country, favorite games, etc.)-->

<!--Settings - shows the settings-->

#### <!--3.9.2 Hardware Interfaces-->
<!--(n/a)-->

#### <!--3.9.3 Software Interfaces-->
<!--The app will be runnable on Android 4.4 and higher. iOS won't be featured at the moment.-->

#### <!--3.9.4 Communication Interfaces-->
<!--The server and hardware will communicate using the http protocol.--> 

### 3.10 Licensing Requirements

### 3.11 Legal, Copyright, and Other Notices
<!--The logo is licensed to the Common Playground Team and is only allowed to use for the application. We do not take responsibilty for any incorrect data or errors in the application.-->

### 3.12 Applicable Standards
<!--The development will follow the common clean code standards and naming conventions. Also we will create a definition of d which will be added here as soon as its complete.-->

## 4. Supporting Information
<!--For any further information you can contact the Common Playground Team or check our [Common Playground Blog](http://commonplayground.wordpress.com).--> 
<!--The Team Members are:-->

<!--Celina Adam-->

<!--Inga Batton-->

<!--Nils Krehl--> 

<!--Denis Reibel-->

<!-- Picture-Link definitions: -->
