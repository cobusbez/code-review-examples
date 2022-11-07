## Code Review Examples
A library of simple and practical code review examples in Java

### Current examples:
- [Eliminate nested if blocks](https://github.com/cobusbez/code-review-examples/blob/main/src/main/java/codesmells/nestedifblocks/NestedIfBlocks.java)

### Areas for review

#### Code formatting
- No redundant comments
- Consistent indentation
- Consistant naming scheme
- Limit line length
#### Best practice standards
- Remove unused methods
- Use descriptive names for methods
- Single responsibility principle
- Code duplication
#### Naming conventions
- Use descriptive names for variable. `FirstName` instead of `name`, `holidayDate` instead of `date`
#### Scalability
- Avoid multiple requests for the same data
- Caching frequently accessed data
- Avoid database level record locking and limit transaction scopes
- Indexing on database columns
#### Maintainability
- Readability of code
- Duplication of code and business logic
- Avoid introducing unnecessary concepts
#### Exception handling
- Do no expose unnecessary information in exception logs
- Log record IDs for troubleshooting
- Handle exceptions at the appropriate level
- Only log exceptions at the last possible minute (before failing or returning to the client)
#### Performance
- Entity mappings with correct initialisation strategies
- Use correct JPA fetch modes
- Data should not be queried inside collection loops
- Appropriate data structures
#### Basic design up front
- Require an adequate level of design up front (especially with new features)
- Answering simple questions like:
  - What does the domain model look like
  - Relationships between new entities and existing entities
- Triggers for specific events
- Design for backward compatibility and failures
- Enforce data integrity with adequate DB constraints
#### Avoid bloated `Service` classes
- Keep services aligned to domain model
- Create fine-grained services
- Create 'worker' classes that are not dependent on other application services for doing translations and manipulating state or doing validation. Worker classes should be easy to cover in unit tests.
- Look for opportunities to split up services.


### Links and further reading
- [How to Do Code Reviews Like a Human - Michael Lynch](https://www.youtube.com/watch?v=0t4_MfHgb_A)
