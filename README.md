# iCatchUpApplication

> A java application to implement a back button for various applications like Maps app and Safari app, using a stack data structure.

## Table of Contents

- [Description](#description)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Required Classes](#required-classes)
  - [Command Interface](#command-interface)
  - [Map Commands](#map-commands)
    - [FindPlace](#findplace)
    - [PlanRoute](#planroute)
    - [StartNavigation](#startnavigation)
  - [Safari Commands](#safari-commands)
    - [GoogleSomething](#googlesomething)
    - [GoToBookmark](#gotobookmark)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [UI Required Functions](#ui-required-functions)

## Description

The iCatchUpApplication project aims to prototype a back button for various applications like the Maps app and Safari app. This back button simulates the behavior of a stack data structure, allowing users to navigate back and forth between commands they entered on the phone app. The prototype demonstrates how the back button will work in the Maps app (e.g., finding a place, planning a route, and starting navigation) and the Safari app (e.g., Googling something and going to a favorite/bookmark).

## Prerequisites

To run the DeliveryListManager project, ensure you have the following installed on your computer:

Java Development Kit (JDK) 1.8 or later
Git (optional, for cloning the repository)

## Installation

1. Clone the iCatchUpApplication repository to your local machine (if you haven't already).

```bash
$ git clone https://github.com/yourusername/iCatchUpApplication.git
$ cd iCatchUpApplication
```
## Usage
To compile 
```bash
$ javac iCatchUp.java
```
Run the DeliveryListManager application from the command line.
```bash
$ java iCatchUp
```
Follow the on-screen prompts to use the prototype and demonstrate how the back button will work in the Maps app and Safari app.

Make sure to create a single package for all the classes and and include them in the first line of your code.

## Required Classes

### Command Interface
Write a fully-documented interface named Command to represent each command entered on the phone app. The Command interface will require the following methods:

### Map Commands
#### FindPlace
Write a fully-documented class named FindPlace to represent the "F: Find a place" command for the Maps app. This class requires the following properties and methods:

#### PlanRoute
Write a fully-documented class named PlanRoute to represent the "P: Plan a route" command for the Maps app. This class requires the following properties and methods:

#### StartNavigation
Write a fully-documented class named StartNavigation to represent the "N: Start Navigation" command for the Maps app. This class requires the following properties and methods:

### Safari Commands
#### GoogleSomething
Write a fully-documented class named GoogleSomething to represent the "G: Google something" command for the Safari app. This class requires the following properties and methods:

#### GoToBookmark
Write a fully-documented class named GoToBookmark to represent the "F: Go to favorite/bookmark" command for the Safari app. This class requires the following properties and methods:

## Contributing
Contributions to iCatchUp are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License.

## Contact
If you have any questions or feedback, you can contact the project maintainer at:

Email: pmtaday@gmail.com
GitHub: @ptaday
