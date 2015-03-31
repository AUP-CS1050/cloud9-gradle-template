# Cloud9 Java Gradle template

You can use this project as a bootstrap in [Cloud9](chttps://c9.io), to get a
running Hello World Java project that you can run and test with Gradle.

To use it, simply create an account in Cloud9, go to your Dashboard, select
"Create New Workspace", and then select the "Clone from URL" option.
Paste the URL of this repository and click on "Create". 

Once your repository is created you will see a "Start editing" option on your
Dashboard. If you click there you will see a new window with an IDE-like
interface. Go to the terminal tab and run `source insta-gradle.sh`.
This will install Gradle and set some environment variables. When the script
finishes you should be able to run `gradle clean run` and see a "Hello World"
message printed out in the console.
