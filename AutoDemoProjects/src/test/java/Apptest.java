import org.junit.Assert;
import org.junit.Test;


public class Apptest {
    String input1 = "noon";
    App app = new App();
    boolean expected = true;

    @Test
    public void isPalindrometest(){
        Assert.assertEquals(expected, app.isPalindrome(input1));
    }

    @Test//(expected = IllegalArgumentException.class)
    public void isPalindrometestNull(){
        Assert.assertEquals(false,
                app.isPalindrome(null));
    }

    @Test
    public void isNotPalindrometest(){

        Assert.assertEquals(false, app.isPalindrome("abc"));
    }

}
