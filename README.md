# spring-boot-notes-backend

Notes app in spring boot. made only for educational purpose. It is just the backend, tested via Postman.

My rough understanding of Spring Boot flow:

```javascript
Client (Frontend / Postman)
        |
        v
[Controller Layer] -> controller/NoteController.java
    - Handles HTTP requests
    - Converts to business methods
        |
        v
[Service Layer] -> service/NoteService.java
    - Applies business logic
    - Delegates to repository
        |
        v
[Repository Layer] -> repository/NoteRepository.java
    - Interacts with the database
        |
        v
[Database] -> model/Note.java
    - Stores and retrieves data

```
