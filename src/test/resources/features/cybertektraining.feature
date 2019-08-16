@SmokeSuite
  Feature: Adding and removing functionality

    Background: Login to CybertekTraining Website
      When User is on CybertekTraining Website
      And User enters correct login credentials
      And User is displayed as the current user of the CybertekTraining Website


      @AddingTeacher
      Scenario: Verifying Adding Teacher Functionality
      When User clicks on teachers link
        And User clicks on add teachers link
        And User fills in correct credentials for teacher and clicks on submit button
        Then Front End and Back End Data match for teacher

        @AddingStudent
        Scenario: Verifying Adding Student Functionality
          When User clicks on student link
          And User  clicks on add student link
          And User fills in correct credentials for student and clicks on submit button
          Then Front End and Back End Data match for student

          @RemovingTeacher
          Scenario Outline: Verifying removing Teacher Functionality
            When User clicks on teacher link
            And User clicks on all teachers link
            And User clicks on options on the right upper corner
            Then Verify that the "<user>" was removed from database

            Examples:
            | name | user |
            | Akgul| teacher|

            @RemovingStudent
            Scenario: Verifying Removing Student Functionality
              When User clicks on student link
              And User clicks on all students link
              And User clicks and enters name in Student text field
              And User clicks on search button
              And User clicks on options on the right upper corner for "<name>"
              And click on delete button
              Then Verify that "<user>" was removed from database

