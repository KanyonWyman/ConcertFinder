# ConcertFinder

## An app for finding and saving upcoming music events for the ABQ area.

App name: 505Show

The functionality of this app will be to find future concerts in the ABQ area.
* Sorting by genre, if the show is all ages or 21+
* Allowing the user to be notified when the tickets go on sale of a show they saved, and when the show gets closer
* The app will also redirect you to where you can get tickets (TicketMaster, the venue's website, ...)


This app will be useful for all music lovers looking for a free and easy way to buy tickets and keep track of their favorite bands coming to town.


This app will require internet connection to search but the user
can still be sent notifications of their shows even when offline.


This app will use data collected from ticket selling sites and local sources such as ABQ alibi.

For more details on the project click this link [Javadoc](docs/api)

##State of completion and readiness

The current state of the app is basic implementation of API from HoldMyTicket that allows the user to see and save upcoming events in ABQ. To be able to use the app, you must sign in using a google account. The future of the app will hold much more funtions for the user including: sharing events to othe3r social medias, save events to your google calender, and using bigger APIs, such as ticket master, to take the app nation wide.

##List of 3rd party libraries

[Facebook Stetho](https://github.com/facebook/stetho)

[Google Play Signin](https://developers.google.com/android/guides/releases)
Allows you to sign in with google

[Apache Commons](https://commons.apache.org/proper/commons-csv/)


Copyright [2019] [Kanyon Wyman]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


##Build Instructions

Step 1 - [Clone Git Repository](https://github.com/KanyonWyman/ConcertFinder)

Step 2 - When creating a new project clone the project from the cloned link generated in the Git Repo for ConcertFinder.

Step 3 - DO NOT OPEN THE project when prompted to. Keep the project closed and select the import option.

Step 4 - Then import the project from Gradle and ensure that the Java language level is set at 1.8.

Step 5 - In the dropdown next to the run and debug symbols, create an app configuration and call it "app". This will allow you to build the app fully.

Step 6 - Run the project and your app should be up and running.


##How to use the app##

Once the app is built and running on your device or emulator, press the sign in button and enter your google credentials. Once you are logged in, you will be directed to the search page where you can begin using the app by searching bands, venues, genres, etc.
