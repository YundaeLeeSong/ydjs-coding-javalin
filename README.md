# Project Conventions & Actions Log

## Project Rules & Guidelines

When contributing to this project, adhere to the following rules:

1. **Package and Directory Structure**:
   - Maintain a consistent Maven directory structure (`src/main/java`, `src/test/java`, `src/main/resources`).
   - Group related assessments by package (e.g., `assessment.java`, `assessment.sql`).
   - SQL solutions should reside in `src/main/resources/assessment/sql/` with a corresponding Java entry point in `src/main/java/assessment/sql/` indicating the SQL file's path.

2. **Test File Organization**:
   - **Rule of 1:1 Mapping**: Each assessment file (`.java` in main) must correspond to exactly one test file (`.java` in test). Do not use single monolithic test classes for multiple independent challenges.

3. **Database Test Setup & Teardown**:
   - **No Hardcoded SQL**: Never use hardcoded string literals in test files for SQL setup (e.g., `CREATE TABLE`, `INSERT`) or teardown (e.g., `DROP TABLE`).
   - Use `javaz.util.FileManager` to load and parse dedicated `.sql` script files from `src/test/resources/...` when preparing database states for testing.
   - Look at the following directories to understand how to setup database,
     - `src/main/java/assessment/sql/s/`
     - `src/main/resources/assessment/sql/s/`
     - `src/test/java/assessment/sql/s/`
     - `src/test/resources/assessment/sql/s/`

4. **Code Documentation (Javadoc)**:
   - Include the full problem description in the Javadoc block of the implementation file.
   - **Line Width**: Word wrap all Javadoc text to a maximum of **80 characters** width.
   - **Character Set**: Use **ASCII characters only**. No fancy quotes, special dashes, or unique bullet points.
   - **Formatting**: Ensure clear indentation and alignment, particularly for tables, input/output examples, and lists.

5. **Continuous Integration (GitHub Actions)**:
   - Use a matrix strategy in the test workflow to run tests by package, not recursively (`**`).
   - Example matrix packages: `"assessment.java.*"`, `"assessment.sql.*"`, ...
   - This ensures each package's tests run in their own isolated thread for optimal performance.

6. **Maven Configuration (`pom.xml`)**:
   - Keep the `pom.xml` as simple and minimal as possible.
   - Do not leave commented-out dependencies or unused plugins in the configuration.
