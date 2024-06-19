# simple-messaging-between-files
Read the Read.me File for information about the project


First I made the classes(Cat,car,cloud,cup)then I created the objects in the main.After that I created 
 *                  IdMaker method and created unique id s for each object.I made an ArrayList"communicators"and with the 
 *                  AddMe method and add each object to the list.Then with the "ALARKO"method I created the txt's of the objects
 *                  I made the log with the ARVE method The reason why I created the log in a method is:
 *                 So that When a new object is created the log will automatically register the objects .
 *                 Then I used the log to pass the information of the objects that are created to the txt'files of every object
 *                 I made 2 methods to send the message to the objects first is the getIdFromObject method I used it
 *                 in the SendMessage method so I can also save the messages to the files without creating a new, 
 *                 separated method.I used split to seperate the string to 3 parts which is:
 *                 the sender’s id, the receiver’s id and the actual message.Then I created a while loop to get the objects
 *                 that are being called.and equalized the parts to the txt files of them so that I can write the message
 *                 to both sender's and reciever's txt files.I included the "ALL" also.
