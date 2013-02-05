Arts and Sciences Evaluation Conversion Program Java Version
Version: 0.1

This program is meant to be used for the Arts and Sciences Dean's Office of Lawrence Technological University.
Other non-LTU purposes must first by authorized by Jeremy Quinlan or the Dean/Associate Dean of Arts and 
Sciences. 

AS_EvaluationConvert.exe is a simple C++ program I created for the sole purpose of compiling .txt evaluation
files for the A&S department for Lawrence Tech. 

The program will read each file with the '####.txt" name, with #### representing a number from 0-9999. 
NOTE: This version of the program cannot separate files by department

To check if the program read all the files, select all the files that need to be read and compare that number 
to the number that the program gives. ie: "Done. 89 opened successfully. 89 read successfully." To find the 
file that the program failed to scan, check each file for a '1' mark on the left-hand corner of the files. 
Currently, the only way for solving this issue is to simply create a new file with the same data to be 
rescanned.