package practice.j;

/**
 * Throw Custom Exception Challenge
 */
public class ThrowCustomException {

    /**
     * This method should throw a CustomException. CustomException is a custom
     * exception that we've written ourselves by extending the Exception class.
     * In a large scale application, writing custom exceptions could provide
     * valuable information for when something goes wrong in the application.
     *
     * You will need to add a 'throws CustomException' declaration to this method,
     * and throw a new CustomException within this method.
     *
     * This also means that you should NOT write a try/catch block in this
     * method, as the tests are expecting to have a method thrown to it. A
     * try/catch block would handle the exception within the method.
     */
    public void throwCustomException() throws CustomException {
        throw new CustomException();
    }
}
