# Cloud9 Java Gradle template

You can use this project as a bootstrap in [Cloud9](chttps://c9.io), to get a
running Hello World Java project that you can run and test with Gradle.

You need first to install the latet Java SDK by running `curl -sL
https://gist.githubusercontent.com/naxmefy/c9b49d10de6827a336f81e6cbcccabe3/raw/16b84294f32c151c3f4951602b736898f036af7f/c9-java8.sh
| sudo bash -`.
Then, go to the terminal tab and run `source install-gradle.sh`.
This will install Gradle and set some environment variables. When the script
finishes you should be able to run `cd demo && gradle clean run` and see a "Hello World"
message printed out in the console.

Before you try running the code, go to the C9 performance panel on the
top right and change the RAM to 1GB and the disk to 5GB.
