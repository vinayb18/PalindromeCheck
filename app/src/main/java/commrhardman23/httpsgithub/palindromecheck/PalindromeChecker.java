package commrhardman23.httpsgithub.palindromecheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeChecker extends AppCompatActivity {

    EditText edtxtUserWord;
    TextView txtvwResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome_checker);

        edtxtUserWord = (EditText) findViewById(R.id.edtxtUserWord);
        txtvwResult = (TextView) findViewById(R.id.txtvwResult);

    }

    /**
     * palindromeCheck is the method that gets called when the user clicks the button to check
     * whether the word they entered is a palindrome. It calls a recursive method to find out
     * whether the word is a palindrome.
     * @param vw is the button that is associated with this method
     */
    public void palindromeCheck(View vw){

        //Get the user input here

        checkForPalindrome(userInput, 0);

    }

    /**
     * checkForPalindrome is a recursive method that checks for whether an inputted word is a
     * palindrome
     * @param word is the word that will be checked for whether it is a palindrome or not
     * @param index is the index currently being checked
     */
    private void checkForPalindrome(String word, int index){

        /**
         * Store the index that is equally distant from the end of the word as the current index
         * is from the beginning of the word in a variable
         *
         * Then check whether or not the letter at these indices are equal. If they are, check
         * whether the index is one less than the indexFromTheEnd or equal to the indexFromTheEnd.
         * If one of those two conditions is met, display that it is a palindrome and then put a
         * return statement. If the two conditions aren't met, call the method again, but add one
         * to the index.
         *
         * If the letters are not equal, display that the word is not a palindrome.
         */

    }
}
