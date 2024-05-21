      ******************************************************************
      * Author:TheAndresG
      * Date:19/05/2024
      * Purpose: Technical Test
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. SEAT-SALES-SYSTEM.
       DATA DIVISION.
           WORKING-STORAGE SECTION.
           01 SEATS.
               05 ROWS OCCURS 10 TIMES INDEXED BY R.
                   10 SEAT OCCURS 10 TIMES INDEXED BY S PIC X VALUE 'L'.
           01 USERIN.
               05 SROW pic x .
               05 SSEAT pic x .
           01 REPEAT pic x . 
       FILE SECTION.
       WORKING-STORAGE SECTION.
       PROCEDURE DIVISION.
       DISPLAY "Seat Sales System".

       MAIN-PROCEDURE.
       DISPLAY "Select row and seat".
       DISPLAY "Select row (0-9)".
       ACCEPT SROW
       
       DISPLAY "Select seat (0-9)".
       ACCEPT SSEAT
       IF SEAT[SROW][SSEAT] == 'L'
           SEAT[SROW][SSEAT] = 'X'
           DISPLAY "The seat was reserved correctly."
           ELSE DISPLAY "The seat is occupied.Please choose another one.".
       END-IF.
       DISPLAY "Do you want to continue with the reservation? (Y/N)".
       ACCEPT REPEAT.
       
       IF REPEAT == 'Y' 
           GO TO MAIN-PROCEDURE.
       ELSE GO TO END-PROGRAM.
       END-IF

      
       END-PROGRAM.
            STOP RUN.


            
       END PROGRAM SEAT-SALES-SYSTEM.

