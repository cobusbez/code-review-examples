## Code Review Examples
A library of simple and practical code review examples in Java

### Current examples:
- [Eliminate nested if blocks](https://github.com/cobusbez/code-review-examples/blob/main/src/main/java/codesmells/nestedifblocks/NestedIfBlocks.java)

###Concepts to avoid bloated `Service` classes
- Keep services aligned to domain model
- Create fine-grained services
- Create 'worker' classes that are not dependent on other application services for doing translations and manipulating state or doing validation. Worker classes should be easy to cover in unit tests.
- Look for opportunities to split up services.

### Links and further reading
- [How to Do Code Reviews Like a Human - Michael Lynch](https://www.youtube.com/watch?v=0t4_MfHgb_A)
