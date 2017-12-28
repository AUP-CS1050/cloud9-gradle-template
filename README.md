# Cloud9 Java Gradle template

You can use this project as a bootstrap in [Cloud9](chttps://c9.io), to get a
running Hello World Java project that you can run and test with Gradle.

You need first to install the latet Java SDK by running `curl -sL
https://gist.githubusercontent.com/naxmefy/c9b49d10de6827a336f81e6cbcccabe3/raw/16b84294f32c151c3f4951602b736898f036af7f/c9-java8.sh
| sudo bash -`.
Then, go to the terminal tab and run `source insta-gradle.sh`.
This will install Gradle and set some environment variables. When the script
finishes you should be able to run `gradle clean run` and see a "Hello World"
message printed out in the console.
