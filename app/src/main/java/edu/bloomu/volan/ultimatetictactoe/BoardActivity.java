package edu.bloomu.volan.ultimatetictactoe;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This class plays the game Ultimate Tic Tac Toe which is a board game composed of nine
 * tic-tac-toe boards arranged in a 3-by-3 grid. Players take turns playing in the smaller
 * tic-tac-toe boards until one of them wins in the larger tic-tac-toe board
 *
 * Created by Volan Nnanpalle on 10/20/17.
 * @author Volan Nnanpalle
 */
public class BoardActivity extends AppCompatActivity {
    //attributes
    private Button buttons[];
    private int count =0;
    private String buttonText = "";
    private int xWins[];
    private int oWins[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board_layout);
        buttons = new Button[81];
        xWins = new int[9];
        oWins = new int[9];
        getButtonID();
        for (int i = 0; i < buttons.length; i++)
        {
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        Toast.makeText(getApplicationContext(),"PLAYER 1 : X & PLAYER 2 : " +
                "O",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"PLAYER 1 : 'X' TURN",Toast.LENGTH_LONG).show();
}
    /**
     * This method inflates the method
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    /**
     * This allows the button to specify where the focus in the board
     * @param view
     */
    public void move(View view) {
        if (count % 2 != 0) {
            Toast.makeText(getApplicationContext(),"PLAYER 1 : 'X' TURN",Toast.LENGTH_LONG).show();
        }
        if (count % 2 == 0) {
            Toast.makeText(getApplicationContext(),"PLAYER 2 : 'O' TURN",Toast.LENGTH_LONG).show();
        }
        switch(view.getId()) {
            case R.id.button1:
                if (buttons[0].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(1))
                            buttons[0].setText(buttonText);
                        else
                            buttons[0].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(1))
                            buttons[0].setText(buttonText);
                        else
                            buttons[0].setText(buttonText);

                        boardOneFocus();
                        checkGridOneWins(1);
                        xCheckGameWon();
                        oCheckGameWon();
                        draw();
                        count++;
                    }}
                 else
                    boardOneFocus();
                break;
            case R.id.button2:
                if (buttons[1].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(2))
                            buttons[1].setText(buttonText);
                        else
                            buttons[1].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(2))
                            buttons[1].setText(buttonText);
                        else
                            buttons[1].setText(buttonText);
                    }
                    boardTwoFocus();
                    checkGridOneWins(2);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardOneFocus();
                break;
            case R.id.button3:
                if (buttons[2].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(3))
                            buttons[2].setText(buttonText);
                        else
                            buttons[2].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(3))
                            buttons[2].setText(buttonText);
                        else
                            buttons[2].setText(buttonText);
                    }
                    boardThreeFocus();
                    checkGridOneWins(3);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardOneFocus();
                break;
            case R.id.button4:
                if (buttons[3].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(1))
                            buttons[3].setText(buttonText);
                        else
                            buttons[3].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(1))
                            buttons[3].setText(buttonText);
                        else
                            buttons[3].setText(buttonText);
                    }
                    boardOneFocus();
                    checkGridTwoWins(1);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardTwoFocus();
                break;
            case R.id.button5:
                if (buttons[4].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(2))
                            buttons[4].setText(buttonText);
                        else
                            buttons[4].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(2))
                            buttons[4].setText(buttonText);
                        else
                            buttons[4].setText(buttonText);
                    }
                    boardTwoFocus();
                    checkGridTwoWins(2);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardTwoFocus();
                break;
            case R.id.button6:
                if (buttons[5].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(3))
                            buttons[5].setText(buttonText);
                        else
                            buttons[5].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(3))
                            buttons[5].setText(buttonText);
                        else
                            buttons[5].setText(buttonText);
                    }
                    boardThreeFocus();
                    checkGridTwoWins(3);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardTwoFocus();
                break;
            case R.id.button7:
                if (buttons[6].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(1))
                            buttons[6].setText(buttonText);
                        else
                            buttons[6].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(1))
                            buttons[6].setText(buttonText);
                        else
                            buttons[6].setText(buttonText);
                    }
                    boardOneFocus();
                    checkGridThreeWins(1);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardThreeFocus();
                break;
            case R.id.button8:
                if (buttons[7].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(2))
                            buttons[7].setText(buttonText);
                        else
                            buttons[7].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(2))
                            buttons[7].setText(buttonText);
                        else
                            buttons[7].setText(buttonText);
                    }
                    boardTwoFocus();
                    checkGridThreeWins(2);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardThreeFocus();
                break;
            case R.id.button9:
                if (buttons[8].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(3))
                            buttons[8].setText(buttonText);
                        else
                            buttons[8].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(3))
                            buttons[8].setText(buttonText);
                        else
                            buttons[8].setText(buttonText);
                    }
                    boardThreeFocus();
                    checkGridThreeWins(3);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardThreeFocus();
                break;
            case R.id.button10:
                if (buttons[9].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(4))
                            buttons[9].setText(buttonText);
                        else
                            buttons[9].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(4))
                            buttons[9].setText(buttonText);
                        else
                            buttons[9].setText(buttonText);
                    }
                    boardFourFoucs();
                    checkGridOneWins(4);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardOneFocus();
                break;
            case R.id.button11:
                if (buttons[10].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(5))
                            buttons[10].setText(buttonText);
                        else
                            buttons[10].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(5))
                            buttons[10].setText(buttonText);
                        else
                            buttons[10].setText(buttonText);
                    }
                    boardFiveFoucs();
                    checkGridOneWins(5);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardOneFocus();
                break;
            case R.id.button12:
                if (buttons[11].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(6))
                            buttons[11].setText(buttonText);
                        else
                            buttons[11].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(6))
                            buttons[11].setText(buttonText);
                        else
                            buttons[11].setText(buttonText);
                    }
                    boardSixFoucs();
                    checkGridOneWins(6);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardOneFocus();
                break;
            case R.id.button13:
                if (buttons[12].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(4))
                            buttons[12].setText(buttonText);
                        else
                            buttons[12].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(4))
                            buttons[12].setText(buttonText);
                        else
                            buttons[12].setText(buttonText);
                    }
                    boardFourFoucs();
                    checkGridTwoWins(4);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardTwoFocus();
                break;
            case R.id.button14:
                if (buttons[13].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(5))
                            buttons[13].setText(buttonText);
                        else
                            buttons[13].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(5))
                            buttons[13].setText(buttonText);
                        else
                            buttons[13].setText(buttonText);
                    }
                    boardFiveFoucs();
                    checkGridTwoWins(5);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardTwoFocus();
                break;
            case R.id.button15:
                if (buttons[14].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(6))
                            buttons[14].setText(buttonText);
                        else
                            buttons[14].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(6))
                            buttons[14].setText(buttonText);
                        else
                            buttons[14].setText(buttonText);
                    }
                    boardSixFoucs();
                    checkGridTwoWins(6);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardTwoFocus();
                break;
            case R.id.button16:
                if (buttons[15].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(4))
                            buttons[15].setText(buttonText);
                        else
                            buttons[15].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(4))
                            buttons[15].setText(buttonText);
                        else
                            buttons[15].setText(buttonText);
                    }
                    boardFourFoucs();
                    checkGridThreeWins(4);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardThreeFocus();
                break;
            case R.id.button17:
                if (buttons[16].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(5))
                            buttons[16].setText(buttonText);
                        else
                            buttons[16].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(5))
                            buttons[16].setText(buttonText);
                        else
                            buttons[16].setText(buttonText);
                    }
                    boardFiveFoucs();
                    checkGridThreeWins(5);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardThreeFocus();
                break;
            case R.id.button18:
                if (buttons[17].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(6))
                            buttons[17].setText(buttonText);
                        else
                            buttons[17].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(6))
                            buttons[17].setText(buttonText);
                        else
                            buttons[17].setText(buttonText);
                    }
                    boardSixFoucs();
                    checkGridThreeWins(6);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardThreeFocus();
                break;
            case R.id.button19:
                if (buttons[18].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(7))
                            buttons[18].setText(buttonText);
                        else
                            buttons[18].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(7))
                            buttons[18].setText(buttonText);
                        else
                            buttons[18].setText(buttonText);
                    }
                    boardSevenFoucs();
                    checkGridOneWins(7);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardOneFocus();
                break;
            case R.id.button20:
                if (buttons[19].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(8))
                            buttons[19].setText(buttonText);
                        else
                            buttons[19].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(8))
                            buttons[19].setText(buttonText);
                    }
                    boardEightFocus();
                    checkGridOneWins(8);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                } else
                    boardOneFocus();
                break;
            case R.id.button21:
                if(buttons[20].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(9))
                            buttons[20].setText(buttonText);
                        else
                            buttons[20].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(9))
                            buttons[20].setText(buttonText);
                        else
                            buttons[20].setText(buttonText);
                    }
                    boardNineFocus();
                    checkGridOneWins(9);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }else
                   boardOneFocus();
                break;
            case R.id.button22:
                if(buttons[21].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(7))
                            buttons[21].setText(buttonText);
                        else
                            buttons[21].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(7))
                            buttons[21].setText(buttonText);
                        else
                            buttons[21].setText(buttonText);
                    }
                    boardSevenFoucs();
                    checkGridTwoWins(7);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                   boardTwoFocus();
                break;
            case R.id.button23:
                if(buttons[22].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(8))
                            buttons[22].setText(buttonText);
                        else
                            buttons[22].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(8))
                            buttons[22].setText(buttonText);
                        else
                            buttons[22].setText(buttonText);
                    }
                    boardEightFocus();
                    checkGridTwoWins(8);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardTwoFocus();
                break;
            case R.id.button24:
                if(buttons[23].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(9))
                            buttons[23].setText(buttonText);
                        else
                            buttons[23].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(9))
                            buttons[23].setText(buttonText);
                        else
                            buttons[23].setText(buttonText);
                    }
                    boardNineFocus();
                    checkGridTwoWins(9);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardTwoFocus();
                break;
            case R.id.button25:
                if(buttons[24].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(7))
                            buttons[24].setText(buttonText);
                        else
                            buttons[24].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(7))
                            buttons[24].setText(buttonText);
                        else
                            buttons[24].setText(buttonText);
                    }
                    boardSevenFoucs();
                    checkGridThreeWins(7);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardThreeFocus();
                break;
            case R.id.button26:
                if(buttons[25].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(8))
                            buttons[25].setText(buttonText);
                        else
                            buttons[25].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(8))
                            buttons[25].setText(buttonText);
                        else
                            buttons[25].setText(buttonText);
                    }
                    boardEightFocus();
                    checkGridThreeWins(8);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardThreeFocus();
                break;
            case R.id.button27:
                if(buttons[26].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(9))
                            buttons[26].setText(buttonText);
                        else
                            buttons[26].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(9))
                            buttons[26].setText(buttonText);
                        else
                            buttons[26].setText(buttonText);
                    }
                    boardNineFocus();
                    checkGridThreeWins(9);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardThreeFocus();
                break;
            case R.id.button28:
                if(buttons[27].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(1))
                            buttons[27].setText(buttonText);
                        else
                            buttons[27].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(1))
                            buttons[27].setText(buttonText);
                        else
                            buttons[27].setText(buttonText);
                    }
                    boardOneFocus();
                    checkGridFourWins(1);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFourFoucs();
                break;
            case R.id.button29:
                if(buttons[28].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(2))
                            buttons[28].setText(buttonText);
                        else
                            buttons[28].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(2))
                            buttons[28].setText(buttonText);
                        else
                            buttons[29].setText(buttonText);
                    }
                    boardTwoFocus();
                    checkGridFourWins(2);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFourFoucs();
                break;
            case R.id.button30:
                if(buttons[29].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(3))
                            buttons[29].setText(buttonText);
                        else
                            buttons[29].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(3))
                            buttons[29].setText(buttonText);
                        else
                            buttons[29].setText(buttonText);
                    }
                    boardThreeFocus();
                    checkGridFourWins(3);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFourFoucs();
                break;
            case R.id.button31:
                if(buttons[30].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(1))
                            buttons[30].setText(buttonText);
                        else
                            buttons[30].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(1))
                            buttons[30].setText(buttonText);
                        else
                            buttons[30].setText(buttonText);
                    }
                    boardOneFocus();
                    checkGridFiveWins(1);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFiveFoucs();
                break;
            case R.id.button32:
                if(buttons[31].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(2))
                            buttons[31].setText(buttonText);
                        else
                            buttons[31].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(2))
                            buttons[31].setText(buttonText);
                        else
                            buttons[31].setText(buttonText);
                    }
                    boardTwoFocus();
                    checkGridFiveWins(2);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFiveFoucs();
                break;
            case R.id.button33:
                if(buttons[32].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(3))
                            buttons[32].setText(buttonText);
                        else
                            buttons[32].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(3))
                            buttons[32].setText(buttonText);
                        else
                            buttons[32].setText(buttonText);
                    }
                    boardThreeFocus();
                    checkGridFiveWins(3);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFiveFoucs();
                break;
            case R.id.button34:
                if(buttons[33].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(1))
                            buttons[33].setText(buttonText);
                        else
                            buttons[33].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(1))
                            buttons[33].setText(buttonText);
                        else
                            buttons[33].setText(buttonText);
                    }
                    boardOneFocus();
                    checkGridSixWins(1);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSixFoucs();
                break;
            case R.id.button35:
                if(buttons[34].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(2))
                            buttons[34].setText(buttonText);
                        else
                            buttons[34].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(2))
                            buttons[34].setText(buttonText);
                        else
                            buttons[34].setText(buttonText);
                    }
                    boardTwoFocus();
                    checkGridSixWins(2);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSixFoucs();
                break;
            case R.id.button36:
                if(buttons[35].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(3))
                            buttons[35].setText(buttonText);
                        else
                            buttons[35].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(3))
                            buttons[35].setText(buttonText);
                        else
                            buttons[35].setText(buttonText);
                    }
                    boardThreeFocus();
                    checkGridSixWins(3);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSixFoucs();
                break;
            case R.id.button37:
                if(buttons[36].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(4))
                            buttons[36].setText(buttonText);
                        else
                            buttons[36].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(4))
                            buttons[36].setText(buttonText);
                        else
                            buttons[36].setText(buttonText);
                    }
                    boardFourFoucs();
                    checkGridFourWins(4);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFourFoucs();
                break;
            case R.id.button38:
                if(buttons[37].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(5))
                            buttons[37].setText(buttonText);
                        else
                            buttons[37].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(5))
                            buttons[37].setText(buttonText);
                        else
                            buttons[37].setText(buttonText);
                    }
                    boardFiveFoucs();
                    checkGridFourWins(5);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFourFoucs();
                break;
            case R.id.button39:
                if(buttons[38].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(6))
                            buttons[38].setText(buttonText);
                        else
                            buttons[38].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(6))
                            buttons[38].setText(buttonText);
                        else
                            buttons[38].setText(buttonText);
                    }
                    boardSixFoucs();
                    checkGridFourWins(6);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFourFoucs();
                break;
            case R.id.button40:
                if(buttons[39].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(4))
                            buttons[39].setText(buttonText);
                        else
                            buttons[39].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(4))
                            buttons[39].setText(buttonText);
                        else
                            buttons[39].setText(buttonText);
                    }
                    boardFourFoucs();
                    checkGridFiveWins(4);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }else
                    boardFiveFoucs();
                break;
            case R.id.button41:
                if(buttons[40].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(5))
                            buttons[40].setText(buttonText);
                        else
                            buttons[40].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(5))
                            buttons[40].setText(buttonText);
                        else
                            buttons[40].setText(buttonText);
                    }
                    boardFiveFoucs();
                    checkGridFiveWins(5);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFiveFoucs();
                break;
            case R.id.button42:
                if(buttons[41].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(6))
                            buttons[41].setText(buttonText);
                        else
                            buttons[41].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(6))
                            buttons[41].setText(buttonText);
                        else
                            buttons[41].setText(buttonText);
                    }
                    boardSixFoucs();
                    checkGridFiveWins(6);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }else
                    boardFiveFoucs();
                break;
            case R.id.button43:
                if(buttons[42].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(4))
                            buttons[42].setText(buttonText);
                        else
                            buttons[42].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(4))
                            buttons[42].setText(buttonText);
                        else
                            buttons[42].setText(buttonText);
                    }
                    boardFourFoucs();
                    checkGridSixWins(4);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSixFoucs();
                break;
            case R.id.button44:
                if(buttons[43].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(5))
                            buttons[43].setText(buttonText);
                        else
                            buttons[43].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(5))
                            buttons[43].setText(buttonText);
                        else
                            buttons[43].setText(buttonText);
                    }
                    boardFiveFoucs();
                    checkGridSixWins(5);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSixFoucs();
                break;
            case R.id.button45:
                if(buttons[44].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(6))
                            buttons[44].setText(buttonText);
                        else
                            buttons[44].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(6))
                            buttons[44].setText(buttonText);
                        else
                            buttons[44].setText(buttonText);
                    }
                    boardSixFoucs();
                    checkGridSixWins(6);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSixFoucs();
                break;
            case R.id.button46:
                if(buttons[45].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(7))
                            buttons[45].setText(buttonText);
                        else
                            buttons[45].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(7))
                            buttons[45].setText(buttonText);
                        else
                            buttons[45].setText(buttonText);
                    }
                    boardSevenFoucs();
                    checkGridFourWins(7);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFourFoucs();
                break;
            case R.id.button47:
                if(buttons[46].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(8))
                            buttons[46].setText(buttonText);
                        else
                            buttons[46].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(8))
                            buttons[46].setText(buttonText);
                        else
                            buttons[46].setText(buttonText);
                    }
                    boardEightFocus();
                    checkGridFourWins(8);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }else
                    boardFourFoucs();
                break;
            case R.id.button48:
                if(buttons[47].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(9))
                            buttons[47].setText(buttonText);
                        else
                            buttons[47].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(9))
                            buttons[47].setText(buttonText);
                        else
                            buttons[47].setText(buttonText);
                    }
                    boardNineFocus();
                    checkGridFourWins(9);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFourFoucs();
                break;
            case R.id.button49:
                if(buttons[48].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(7))
                            buttons[48].setText(buttonText);
                        else
                            buttons[48].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(7))
                            buttons[48].setText(buttonText);
                        else
                            buttons[48].setText(buttonText);
                    }
                    boardSevenFoucs();
                    checkGridFiveWins(7);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                   boardFiveFoucs();
                break;
            case R.id.button50:
                if(buttons[49].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(8))
                            buttons[49].setText(buttonText);
                        else
                            buttons[49].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(8))
                            buttons[49].setText(buttonText);
                        else
                            buttons[49].setText(buttonText);
                    }
                    boardEightFocus();
                    checkGridFiveWins(8);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFiveFoucs();
                break;
            case R.id.button51:
                if(buttons[50].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(9))
                            buttons[50].setText(buttonText);
                        else
                            buttons[50].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(9))
                            buttons[50].setText(buttonText);
                        else
                            buttons[50].setText(buttonText);
                    }
                    boardNineFocus();
                    checkGridFiveWins(9);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardFiveFoucs();
                break;
            case R.id.button52:
                if(buttons[51].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(7))
                            buttons[51].setText(buttonText);
                        else
                            buttons[51].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(7))
                            buttons[51].setText(buttonText);
                        else
                            buttons[51].setText(buttonText);
                    }
                    boardSevenFoucs();
                    checkGridSixWins(7);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSixFoucs();
                break;
            case R.id.button53:
                if(buttons[52].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(8))
                            buttons[52].setText(buttonText);
                        else
                            buttons[52].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(8))
                            buttons[52].setText(buttonText);
                        else
                            buttons[52].setText(buttonText);
                    }
                    boardEightFocus();
                    checkGridSixWins(8);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSixFoucs();
                break;
            case R.id.button54:
                if(buttons[53].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(9))
                            buttons[53].setText(buttonText);
                        else
                            buttons[53].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(9))
                            buttons[53].setText(buttonText);
                        else
                            buttons[53].setText(buttonText);
                    }
                    boardNineFocus();
                    checkGridSixWins(9);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSixFoucs();
                break;
            case R.id.button55:
                if(buttons[54].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(1))
                            buttons[54].setText(buttonText);
                        else
                            buttons[54].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(1))
                            buttons[54].setText(buttonText);
                        else
                            buttons[54].setText(buttonText);
                    }
                    boardOneFocus();
                    checkGridSevenWins(1);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSevenFoucs();
                break;
            case R.id.button56:
                if(buttons[55].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(2))
                            buttons[55].setText(buttonText);
                        else
                            buttons[55].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(2))
                            buttons[55].setText(buttonText);
                        else
                            buttons[55].setText(buttonText);
                    }
                    boardTwoFocus();
                    checkGridSevenWins(2);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSevenFoucs();
                break;
            case R.id.button57:
                if(buttons[56].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(3))
                            buttons[56].setText(buttonText);
                        else
                            buttons[56].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(3))
                            buttons[56].setText(buttonText);
                        else
                            buttons[56].setText(buttonText);
                    }
                    boardThreeFocus();
                    checkGridSevenWins(3);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSevenFoucs();
                break;
            case R.id.button58:
                if(buttons[57].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(1))
                            buttons[57].setText(buttonText);
                        else
                            buttons[57].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(1))
                            buttons[57].setText(buttonText);
                        else
                            buttons[57].setText(buttonText);
                    }
                    boardOneFocus();
                    checkGridEightWins(1);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardEightFocus();
                break;
            case R.id.button59:
                if(buttons[58].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(2))
                            buttons[58].setText(buttonText);
                        else
                            buttons[58].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(2))
                            buttons[58].setText(buttonText);
                        else
                            buttons[58].setText(buttonText);
                    }
                    boardTwoFocus();
                    checkGridEightWins(2);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardEightFocus();
                break;
            case R.id.button60:
                if(buttons[59].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(3))
                            buttons[59].setText(buttonText);
                        else
                            buttons[59].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(3))
                            buttons[59].setText(buttonText);
                        else
                            buttons[59].setText(buttonText);
                    }
                    boardThreeFocus();
                    checkGridEightWins(3);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardEightFocus();
                break;
            case R.id.button61:
                if(buttons[60].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(1))
                            buttons[60].setText(buttonText);
                        else
                            buttons[60].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(1))
                            buttons[60].setText(buttonText);
                        else
                            buttons[60].setText(buttonText);
                    }
                    boardOneFocus();
                    checkGridNineWins(1);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardNineFocus();
                break;
            case R.id.button62:
                if(buttons[61].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(2))
                            buttons[61].setText(buttonText);
                        else
                            buttons[61].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(2))
                            buttons[61].setText(buttonText);
                        else
                            buttons[61].setText(buttonText);
                    }
                    boardTwoFocus();
                    checkGridNineWins(2);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardNineFocus();
                break;
            case R.id.button63:
                if(buttons[62].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(3))
                            buttons[62].setText(buttonText);
                        else
                            buttons[62].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(3))
                            buttons[62].setText(buttonText);
                        else
                            buttons[62].setText(buttonText);
                    }
                    boardThreeFocus();
                    checkGridNineWins(3);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardNineFocus();
                break;
            case R.id.button64:
                if(buttons[63].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(4))
                            buttons[63].setText(buttonText);
                        else
                            buttons[63].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(4))
                            buttons[63].setText(buttonText);
                        else
                            buttons[63].setText(buttonText);
                    }
                    boardFourFoucs();
                    checkGridSevenWins(4);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSevenFoucs();
                break;
            case R.id.button65:
                if(buttons[64].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(5))
                            buttons[64].setText(buttonText);
                        else
                            buttons[64].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(5))
                            buttons[64].setText(buttonText);
                        else
                            buttons[64].setText(buttonText);
                    }
                    boardFiveFoucs();
                    checkGridSevenWins(5);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSevenFoucs();
                break;
            case R.id.button66:
                if(buttons[65].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(6))
                            buttons[65].setText(buttonText);
                        else
                            buttons[65].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(6))
                            buttons[65].setText(buttonText);
                        else
                            buttons[65].setText(buttonText);
                    }
                    boardSixFoucs();
                    checkGridSevenWins(6);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSevenFoucs();
                break;
            case R.id.button67:
                if(buttons[66].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(4))
                            buttons[66].setText(buttonText);
                        else
                            buttons[66].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(4))
                            buttons[66].setText(buttonText);
                        else
                            buttons[66].setText(buttonText);
                    }
                    boardFourFoucs();
                    checkGridEightWins(4);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardEightFocus();
                break;
            case R.id.button68:
                if(buttons[67].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(5))
                            buttons[67].setText(buttonText);
                        else
                            buttons[67].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(5))
                            buttons[67].setText(buttonText);
                        else
                            buttons[67].setText(buttonText);
                    }
                    boardFiveFoucs();
                    checkGridEightWins(5);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardEightFocus();
                break;
            case R.id.button69:
                if(buttons[68].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(6))
                            buttons[68].setText(buttonText);
                        else
                            buttons[68].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(6))
                            buttons[68].setText(buttonText);
                        else
                            buttons[68].setText(buttonText);
                    }
                    boardSixFoucs();
                    checkGridEightWins(6);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardEightFocus();
                break;
            case R.id.button70:
                if(buttons[69].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(4))
                            buttons[69].setText(buttonText);
                        else
                            buttons[69].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(4))
                            buttons[69].setText(buttonText);
                        else
                            buttons[69].setText(buttonText);
                    }
                    boardFourFoucs();
                    checkGridNineWins(4);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardNineFocus();
                break;
            case R.id.button71:
                if(buttons[70].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(5))
                            buttons[70].setText(buttonText);
                        else
                            buttons[70].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(5))
                            buttons[70].setText(buttonText);
                        else
                            buttons[70].setText(buttonText);
                    }
                    boardFiveFoucs();
                    checkGridNineWins(5);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardNineFocus();
                break;
            case R.id.button72:
                if(buttons[70].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(6))
                            buttons[71].setText(buttonText);
                        else
                            buttons[71].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(6))
                            buttons[71].setText(buttonText);
                        else
                            buttons[71].setText(buttonText);
                    }
                    boardSixFoucs();
                    checkGridNineWins(6);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardNineFocus();
                break;
            case R.id.button73:
                if(buttons[72].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(7))
                            buttons[72].setText(buttonText);
                        else
                            buttons[72].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(7))
                            buttons[72].setText(buttonText);
                        else
                            buttons[72].setText(buttonText);
                    }
                    boardSevenFoucs();
                    checkGridSevenWins(7);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSevenFoucs();
                break;
            case R.id.button74:
                if(buttons[73].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(8))
                            buttons[73].setText(buttonText);
                        else
                            buttons[73].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(8))
                            buttons[73].setText(buttonText);
                        else
                            buttons[73].setText(buttonText);
                    }
                    boardEightFocus();
                    checkGridSevenWins(8);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardSevenFoucs();
                break;
            case R.id.button75:
                if(buttons[74].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(9))
                            buttons[74].setText(buttonText);
                        else
                            buttons[74].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(9))
                            buttons[74].setText(buttonText);
                        else
                            buttons[74].setText(buttonText);
                    }
                    boardNineFocus();
                    checkGridSevenWins(9);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                   boardSevenFoucs();
                break;
            case R.id.button76:
                if(buttons[75].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(7))
                            buttons[75].setText(buttonText);
                        else
                            buttons[75].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(7))
                            buttons[75].setText(buttonText);
                        else
                            buttons[75].setText(buttonText);
                    }
                    boardSevenFoucs();
                    checkGridEightWins(7);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardEightFocus();
                break;
            case R.id.button77:
                if(buttons[76].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(8))
                            buttons[76].setText(buttonText);
                        else
                            buttons[76].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(8))
                            buttons[76].setText(buttonText);
                        else
                            buttons[76].setText(buttonText);
                    }
                    boardEightFocus();
                    checkGridEightWins(8);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardEightFocus();
                break;
            case R.id.button78:
                if(buttons[77].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(9))
                            buttons[77].setText(buttonText);
                        else
                            buttons[77].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(9))
                            buttons[77].setText(buttonText);
                        else
                            buttons[77].setText(buttonText);
                    }
                    boardNineFocus();
                    checkGridEightWins(9);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardEightFocus();
                break;
            case R.id.button79:
                if(buttons[78].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(7))
                            buttons[78].setText(buttonText);
                        else
                            buttons[78].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(7))
                            buttons[78].setText(buttonText);
                        else
                            buttons[78].setText(buttonText);
                    }
                    boardSevenFoucs();
                    checkGridNineWins(7);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardNineFocus();
                break;
            case R.id.button80:
                if(buttons[79].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(8))
                            buttons[79].setText(buttonText);
                        else
                            buttons[79].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(8))
                            buttons[79].setText(buttonText);
                        else
                            buttons[79].setText(buttonText);
                    }
                    boardEightFocus();
                    checkGridNineWins(8);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardNineFocus();
                break;
            case R.id.button81:
                if(buttons[80].getText().toString().equals("")) {
                    if (count % 2 == 0) {
                        buttonText = "X";
                        if (!xCheckCellGridAvailability(9))
                            buttons[80].setText(buttonText);
                        else
                            buttons[80].setText(buttonText);
                    }
                    if (count % 2 != 0) {
                        buttonText = "O";
                        if (!oCheckCellGridAvailability(9))
                            buttons[80].setText(buttonText);
                        else
                            buttons[80].setText(buttonText);
                    }
                    boardNineFocus();
                    checkGridNineWins(9);
                    xCheckGameWon();
                    oCheckGameWon();
                    draw();
                    count++;
                }
                else
                    boardNineFocus();
                break;
            default:
                throw new RuntimeException("Button ID Not Found");
        }
    }
    /**
     * This methods get all the button id's and stores them in an array
     */
    public void getButtonID()
    {
        buttons[0]= (Button) findViewById(R.id.button1);
        buttons[1]= (Button) findViewById(R.id.button2);
        buttons[2]= (Button) findViewById(R.id.button3);
        buttons[3]= (Button) findViewById(R.id.button4);
        buttons[4]= (Button) findViewById(R.id.button5);
        buttons[5]= (Button) findViewById(R.id.button6);
        buttons[6]= (Button) findViewById(R.id.button7);
        buttons[7]= (Button) findViewById(R.id.button8);
        buttons[8]= (Button) findViewById(R.id.button9);
        buttons[9]= (Button) findViewById(R.id.button10);
        buttons[10]= (Button) findViewById(R.id.button11);
        buttons[11]= (Button) findViewById(R.id.button12);
        buttons[12]= (Button) findViewById(R.id.button13);
        buttons[13]= (Button) findViewById(R.id.button14);
        buttons[14]= (Button) findViewById(R.id.button15);
        buttons[15]= (Button) findViewById(R.id.button16);
        buttons[16]= (Button) findViewById(R.id.button17);
        buttons[17]= (Button) findViewById(R.id.button18);
        buttons[18]= (Button) findViewById(R.id.button19);
        buttons[19]= (Button) findViewById(R.id.button20);
        buttons[20]= (Button) findViewById(R.id.button21);
        buttons[21]= (Button) findViewById(R.id.button22);
        buttons[22]= (Button) findViewById(R.id.button23);
        buttons[23]= (Button) findViewById(R.id.button24);
        buttons[24]= (Button) findViewById(R.id.button25);
        buttons[25]= (Button) findViewById(R.id.button26);
        buttons[26]= (Button) findViewById(R.id.button27);
        buttons[27]= (Button) findViewById(R.id.button28);
        buttons[28]= (Button) findViewById(R.id.button29);
        buttons[29]= (Button) findViewById(R.id.button30);
        buttons[30]= (Button) findViewById(R.id.button31);
        buttons[31]= (Button) findViewById(R.id.button32);
        buttons[32]= (Button) findViewById(R.id.button33);
        buttons[33]= (Button) findViewById(R.id.button34);
        buttons[34]= (Button) findViewById(R.id.button35);
        buttons[35]= (Button) findViewById(R.id.button36);
        buttons[36]= (Button) findViewById(R.id.button37);
        buttons[37]= (Button) findViewById(R.id.button38);
        buttons[38]= (Button) findViewById(R.id.button39);
        buttons[39]= (Button) findViewById(R.id.button40);
        buttons[40]= (Button) findViewById(R.id.button41);
        buttons[41]= (Button) findViewById(R.id.button42);
        buttons[42]= (Button) findViewById(R.id.button43);
        buttons[43]= (Button) findViewById(R.id.button44);
        buttons[44]= (Button) findViewById(R.id.button45);
        buttons[45]= (Button) findViewById(R.id.button46);
        buttons[46]= (Button) findViewById(R.id.button47);
        buttons[47]= (Button) findViewById(R.id.button48);
        buttons[48]= (Button) findViewById(R.id.button49);
        buttons[49]= (Button) findViewById(R.id.button50);
        buttons[50]= (Button) findViewById(R.id.button51);
        buttons[51]= (Button) findViewById(R.id.button52);
        buttons[52]= (Button) findViewById(R.id.button53);
        buttons[53]= (Button) findViewById(R.id.button54);
        buttons[54]= (Button) findViewById(R.id.button55);
        buttons[55]= (Button) findViewById(R.id.button56);
        buttons[56]= (Button) findViewById(R.id.button57);
        buttons[57]= (Button) findViewById(R.id.button58);
        buttons[58]= (Button) findViewById(R.id.button59);
        buttons[59]= (Button) findViewById(R.id.button60);
        buttons[60]= (Button) findViewById(R.id.button61);
        buttons[61]= (Button) findViewById(R.id.button62);
        buttons[62]= (Button) findViewById(R.id.button63);
        buttons[63]= (Button) findViewById(R.id.button64);
        buttons[64]= (Button) findViewById(R.id.button65);
        buttons[65]= (Button) findViewById(R.id.button66);
        buttons[66]= (Button) findViewById(R.id.button67);
        buttons[67]= (Button) findViewById(R.id.button68);
        buttons[68]= (Button) findViewById(R.id.button69);
        buttons[69]= (Button) findViewById(R.id.button70);
        buttons[70]= (Button) findViewById(R.id.button71);
        buttons[71]= (Button) findViewById(R.id.button72);
        buttons[72]= (Button) findViewById(R.id.button73);
        buttons[73]= (Button) findViewById(R.id.button74);
        buttons[74]= (Button) findViewById(R.id.button75);
        buttons[75]= (Button) findViewById(R.id.button76);
        buttons[76]= (Button) findViewById(R.id.button77);
        buttons[77]= (Button) findViewById(R.id.button78);
        buttons[78]= (Button) findViewById(R.id.button79);
        buttons[79]= (Button) findViewById(R.id.button80);
        buttons[80]= (Button) findViewById(R.id.button81);
    }
    /**
     * This method allows the user to start a new game and clear the board
     * @param view
     */
    public void newGame(View view)
    {
        TextView winner = (TextView) findViewById(R.id.winner);
        winner.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(getApplicationContext(), BoardActivity.class);
        startActivity(intent);
    }
    /**
     * This method allows the user to return to the home screen
     * @param view
     */
    public void home(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    /**
     * This method checks if the grid has been won by a player
     * @param position the location of the grid
     */
    public void checkGridOneWins(int position)
    {
        //check for X wins
        if (buttons[0].getText().toString().equals("X") &&
                buttons[1].getText().toString().equals("X") &&
                buttons[2].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if( buttons[i].getBackground().getConstantState()==
                        getResources().getDrawable(R.color.player1Win).getConstantState())
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if( buttons[i].getBackground().getConstantState()==
                        getResources().getDrawable(R.color.player2Win).getConstantState())
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18
                        || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[0]++;
            moveFocus(position);

        }
        if (buttons[9].getText().toString().equals("X") &&
                buttons[10].getText().toString().equals("X") &&
                buttons[11].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if( buttons[i].getBackground().getConstantState()==
                        getResources().getDrawable(R.color.player2Win).getConstantState()){
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[0]++;
            moveFocus(position);

        }
        if (buttons[18].getText().toString().equals("X") && buttons[19].getText().toString().equals("X") && buttons[20].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[0]++;
            moveFocus(position);

        }
        if (buttons[0].getText().toString().equals("X") && buttons[9].getText().toString().equals("X") && buttons[18].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    buttons[i].setOnClickListener(null);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    buttons[i].setOnClickListener(null);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    buttons[i].setOnClickListener(null);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }

            xWins[0]++;
            moveFocus(position);
        }
        if (buttons[1].getText().toString().equals("X") && buttons[10].getText().toString().equals("X") && buttons[19].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if( buttons[i].getBackground().getConstantState()==getResources().getDrawable(R.color.player2Win).getConstantState()){
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[0]++;
            moveFocus(position);
        }
        if (buttons[2].getText().toString().equals("X") && buttons[11].getText().toString().equals("X") && buttons[20].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[0]++;
            moveFocus(position);
        }
        if (buttons[0].getText().toString().equals("X") && buttons[10].getText().toString().equals("X") && buttons[20].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[0]++;
            moveFocus(position);
        }
        if (buttons[2].getText().toString().equals("X") && buttons[10].getText().toString().equals("X") && buttons[18].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[0]++;
            moveFocus(position);
        }

        //check for O wins
        if (buttons[0].getText().toString().equals("O") && buttons[1].getText().toString().equals("O") && buttons[2].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[0]++;
            moveFocus(position);

        }
        if (buttons[9].getText().toString().equals("O") && buttons[10].getText().toString().equals("O") && buttons[11].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[0]++;
            moveFocus(position);
        }
        if (buttons[18].getText().toString().equals("O") && buttons[19].getText().toString().equals("O") && buttons[20].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[0]++;
            moveFocus(position);
        }
        if (buttons[0].getText().toString().equals("O") && buttons[9].getText().toString().equals("O") && buttons[18].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[0]++;
            moveFocus(position);
        }
        if (buttons[1].getText().toString().equals("O") && buttons[10].getText().toString().equals("O") && buttons[19].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[0]++;
            moveFocus(position);
        }
        if (buttons[2].getText().toString().equals("O") && buttons[11].getText().toString().equals("O") && buttons[20].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[0]++;
            moveFocus(position);
        }
        if (buttons[0].getText().toString().equals("O") && buttons[10].getText().toString().equals("O") && buttons[20].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[0]++;
            moveFocus(position);
        }
        if (buttons[2].getText().toString().equals("O") && buttons[10].getText().toString().equals("O") && buttons[18].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[0]++;
            moveFocus(position);
        }
    }
    /**
     * This method checks if the grid has been won by a player
     * @param position the location of the grid
     */
    public void checkGridTwoWins(int position)
    {
        //check for X wins
        if (buttons[3].getText().toString().equals("X") && buttons[4].getText().toString().equals("X") && buttons[5].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }

                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[1]++;
            moveFocus(position);

        }
        if (buttons[12].getText().toString().equals("X") && buttons[13].getText().toString().equals("X") && buttons[14].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[1]++;
            moveFocus(position);


        }
        if (buttons[21].getText().toString().equals("X") && buttons[22].getText().toString().equals("X") && buttons[23].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[1]++;
            moveFocus(position);

        }
        if (buttons[3].getText().toString().equals("X") && buttons[12].getText().toString().equals("X") && buttons[21].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }

            xWins[1]++;
            moveFocus(position);
        }
        if (buttons[4].getText().toString().equals("X") && buttons[13].getText().toString().equals("X") && buttons[22].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[1]++;
            moveFocus(position);
        }
        if (buttons[5].getText().toString().equals("X") && buttons[14].getText().toString().equals("X") && buttons[23].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[1]++;
            moveFocus(position);
        }
        if (buttons[3].getText().toString().equals("X") && buttons[13].getText().toString().equals("X") && buttons[23].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[1]++;
            moveFocus(position);
        }
        if (buttons[5].getText().toString().equals("X") && buttons[13].getText().toString().equals("X") && buttons[21].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[1]++;
            moveFocus(position);
        }

        //check for O wins
        if (buttons[3].getText().toString().equals("O") && buttons[4].getText().toString().equals("O") && buttons[5].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[1]++;
            moveFocus(position);

        }
        if (buttons[12].getText().toString().equals("O") && buttons[13].getText().toString().equals("O") && buttons[14].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[1]++;
            moveFocus(position);
        }
        if (buttons[21].getText().toString().equals("O") && buttons[22].getText().toString().equals("O") && buttons[23].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[1]++;
            moveFocus(position);
        }
        if (buttons[3].getText().toString().equals("O") && buttons[12].getText().toString().equals("O") && buttons[21].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[1]++;
            moveFocus(position);
        }
        if (buttons[4].getText().toString().equals("O") && buttons[13].getText().toString().equals("O") && buttons[22].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[1]++;
            moveFocus(position);
        }
        if (buttons[5].getText().toString().equals("O") && buttons[14].getText().toString().equals("O") && buttons[23].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[1]++;
            moveFocus(position);
        }
        if (buttons[3].getText().toString().equals("O") && buttons[13].getText().toString().equals("O") && buttons[23].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[1]++;
            moveFocus(position);
        }
        if (buttons[5].getText().toString().equals("O") && buttons[13].getText().toString().equals("O") && buttons[21].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                int id = ((ColorDrawable)buttons[i].getBackground()).getColor();
                if(id == R.color.player1Win)
                {
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                if(id == R.color.player2Win)
                {
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[1]++;
            moveFocus(position);
        }
    }
    /**
     * This method checks if the grid has been won by a player
     * @param position the location of the grid
     */
    public void checkGridThreeWins(int position)
    {
        //check for X wins
        if (buttons[6].getText().toString().equals("X") && buttons[7].getText().toString().equals("X") && buttons[8].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[2]++;
            moveFocus(position);

        }
        if (buttons[15].getText().toString().equals("X") && buttons[16].getText().toString().equals("X") && buttons[17].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[2]++;
            moveFocus(position);


        }
        if (buttons[24].getText().toString().equals("X") && buttons[25].getText().toString().equals("X") && buttons[26].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[2]++;
            moveFocus(position);

        }
        if (buttons[6].getText().toString().equals("X") && buttons[15].getText().toString().equals("X") && buttons[24].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }

            xWins[2]++;
            moveFocus(position);
        }
        if (buttons[7].getText().toString().equals("X") && buttons[16].getText().toString().equals("X") && buttons[25].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[2]++;
            moveFocus(position);
        }
        if (buttons[8].getText().toString().equals("X") && buttons[17].getText().toString().equals("X") && buttons[26].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[2]++;
            moveFocus(position);
        }
        if (buttons[6].getText().toString().equals("X") && buttons[16].getText().toString().equals("X") && buttons[26].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[2]++;
            moveFocus(position);
        }
        if (buttons[8].getText().toString().equals("X") && buttons[16].getText().toString().equals("X") && buttons[24].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[2]++;
            moveFocus(position);
        }


        //check for O wins
        if (buttons[6].getText().toString().equals("O") && buttons[7].getText().toString().equals("O") && buttons[8].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[2]++;
            moveFocus(position);

        }
        if (buttons[15].getText().toString().equals("O") && buttons[16].getText().toString().equals("O") && buttons[17].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[2]++;
            moveFocus(position);
        }
        if (buttons[24].getText().toString().equals("O") && buttons[25].getText().toString().equals("O") && buttons[26].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[2]++;
            moveFocus(position);
        }
        if (buttons[6].getText().toString().equals("O") && buttons[15].getText().toString().equals("O") && buttons[24].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[2]++;
            moveFocus(position);
        }
        if (buttons[7].getText().toString().equals("O") && buttons[16].getText().toString().equals("O") && buttons[25].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[2]++;
            moveFocus(position);
        }
        if (buttons[8].getText().toString().equals("O") && buttons[17].getText().toString().equals("O") && buttons[26].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[2]++;
            moveFocus(position);
        }
        if (buttons[6].getText().toString().equals("O") && buttons[16].getText().toString().equals("O") && buttons[26].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[2]++;
            moveFocus(position);
        }
        if (buttons[8].getText().toString().equals("O") && buttons[16].getText().toString().equals("O") && buttons[24].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[2]++;
            moveFocus(position);
        }
    }
    /**
     * This method checks if the grid has been won by a player
     * @param position the location of the grid
     */
    public void checkGridFourWins(int position)
    {
        //check for X wins
        if (buttons[27].getText().toString().equals("X") && buttons[28].getText().toString().equals("X") && buttons[29].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[3]++;
            moveFocus(position);

        }
        if (buttons[36].getText().toString().equals("X") && buttons[37].getText().toString().equals("X") && buttons[38].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[3]++;
            moveFocus(position);


        }
        if (buttons[45].getText().toString().equals("X") && buttons[46].getText().toString().equals("X") && buttons[47].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[3]++;
            moveFocus(position);

        }
        if (buttons[27].getText().toString().equals("X") && buttons[36].getText().toString().equals("X") && buttons[45].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }

            xWins[3]++;
            moveFocus(position);
        }
        if (buttons[28].getText().toString().equals("X") && buttons[37].getText().toString().equals("X") && buttons[46].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[3]++;
            moveFocus(position);
        }
        if (buttons[29].getText().toString().equals("X") && buttons[38].getText().toString().equals("X") && buttons[47].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[3]++;
            moveFocus(position);
        }
        if (buttons[27].getText().toString().equals("X") && buttons[37].getText().toString().equals("X") && buttons[47].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[3]++;
            moveFocus(position);
        }
        if (buttons[29].getText().toString().equals("X") && buttons[37].getText().toString().equals("X") && buttons[45].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[3]++;
            moveFocus(position);
        }


        //check for O wins
        if (buttons[27].getText().toString().equals("O") && buttons[28].getText().toString().equals("O") && buttons[29].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[3]++;
            moveFocus(position);

        }
        if (buttons[36].getText().toString().equals("O") && buttons[37].getText().toString().equals("O") && buttons[38].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[3]++;
            moveFocus(position);
        }
        if (buttons[45].getText().toString().equals("O") && buttons[46].getText().toString().equals("O") && buttons[47].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[3]++;
            moveFocus(position);
        }
        if (buttons[27].getText().toString().equals("O") && buttons[36].getText().toString().equals("O") && buttons[45].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[3]++;
            moveFocus(position);
        }
        if (buttons[28].getText().toString().equals("O") && buttons[37].getText().toString().equals("O") && buttons[46].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[3]++;
            moveFocus(position);
        }
        if (buttons[29].getText().toString().equals("O") && buttons[38].getText().toString().equals("O") && buttons[47].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[3]++;
            moveFocus(position);
        }
        if (buttons[27].getText().toString().equals("O") && buttons[37].getText().toString().equals("O") && buttons[47].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[3]++;
            moveFocus(position);
        }
        if (buttons[29].getText().toString().equals("O") && buttons[37].getText().toString().equals("O") && buttons[45].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[3]++;
            moveFocus(position);
        }
    }
    /**
     * This method checks if the grid has been won by a player
     * @param position the location of the grid
     */
    public void checkGridFiveWins(int position)
    {
        //check for X wins
        if (buttons[30].getText().toString().equals("X") && buttons[31].getText().toString().equals("X") && buttons[32].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[4]++;
            moveFocus(position);

        }
        if (buttons[39].getText().toString().equals("X") && buttons[40].getText().toString().equals("X") && buttons[41].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[4]++;
            moveFocus(position);

        }
        if (buttons[48].getText().toString().equals("X") && buttons[49].getText().toString().equals("X") && buttons[50].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[4]++;
            moveFocus(position);

        }
        if (buttons[30].getText().toString().equals("X") && buttons[39].getText().toString().equals("X") && buttons[48].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }

            xWins[4]++;
            moveFocus(position);
        }
        if (buttons[31].getText().toString().equals("X") && buttons[40].getText().toString().equals("X") && buttons[49].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[4]++;
            moveFocus(position);
        }
        if (buttons[32].getText().toString().equals("X") && buttons[41].getText().toString().equals("X") && buttons[50].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[4]++;
            moveFocus(position);
        }
        if (buttons[30].getText().toString().equals("X") && buttons[40].getText().toString().equals("X") && buttons[50].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[4]++;
            moveFocus(position);
        }
        if (buttons[32].getText().toString().equals("X") && buttons[40].getText().toString().equals("X") && buttons[48].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[4]++;
            moveFocus(position);
        }


        //check for O wins
        if (buttons[30].getText().toString().equals("O") && buttons[31].getText().toString().equals("O") && buttons[32].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[4]++;
            moveFocus(position);

        }
        if (buttons[39].getText().toString().equals("O") && buttons[40].getText().toString().equals("O") && buttons[41].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[4]++;
            moveFocus(position);
        }
        if (buttons[48].getText().toString().equals("O") && buttons[49].getText().toString().equals("O") && buttons[50].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[4]++;
            moveFocus(position);
        }
        if (buttons[30].getText().toString().equals("O") && buttons[39].getText().toString().equals("O") && buttons[48].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[4]++;
            moveFocus(position);
        }
        if (buttons[31].getText().toString().equals("O") && buttons[40].getText().toString().equals("O") && buttons[49].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[4]++;
            moveFocus(position);
        }
        if (buttons[32].getText().toString().equals("O") && buttons[41].getText().toString().equals("O") && buttons[50].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[4]++;
            moveFocus(position);
        }
        if (buttons[30].getText().toString().equals("O") && buttons[40].getText().toString().equals("O") && buttons[50].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[4]++;
            moveFocus(position);
        }
        if (buttons[32].getText().toString().equals("O") && buttons[40].getText().toString().equals("O") && buttons[48].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[4]++;
            moveFocus(position);
        }
    }
    /**
     * This method checks if the grid has been won by a player
     * @param position the location of the grid
     */
    public void checkGridSixWins(int position)
    {
        //check for X wins
        if (buttons[33].getText().toString().equals("X") && buttons[34].getText().toString().equals("X") && buttons[35].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[5]++;
            moveFocus(position);

        }
        if (buttons[42].getText().toString().equals("X") && buttons[43].getText().toString().equals("X") && buttons[44].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[5]++;
            moveFocus(position);


        }
        if (buttons[51].getText().toString().equals("X") && buttons[52].getText().toString().equals("X") && buttons[53].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[5]++;
            moveFocus(position);

        }
        if (buttons[33].getText().toString().equals("X") && buttons[42].getText().toString().equals("X") && buttons[51].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }

            xWins[5]++;
            moveFocus(position);
        }
        if (buttons[34].getText().toString().equals("X") && buttons[43].getText().toString().equals("X") && buttons[52].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[5]++;
            moveFocus(position);
        }
        if (buttons[35].getText().toString().equals("X") && buttons[44].getText().toString().equals("X") && buttons[53].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[5]++;
            moveFocus(position);
        }
        if (buttons[33].getText().toString().equals("X") && buttons[43].getText().toString().equals("X") && buttons[53].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[5]++;
            moveFocus(position);
        }
        if (buttons[35].getText().toString().equals("X") && buttons[43].getText().toString().equals("X") && buttons[51].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[5]++;
            moveFocus(position);
        }


        //check for O wins
        if (buttons[33].getText().toString().equals("O") && buttons[34].getText().toString().equals("O") && buttons[35].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[5]++;
            moveFocus(position);

        }
        if (buttons[42].getText().toString().equals("O") && buttons[43].getText().toString().equals("O") && buttons[44].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[5]++;
            moveFocus(position);
        }
        if (buttons[51].getText().toString().equals("O") && buttons[52].getText().toString().equals("O") && buttons[53].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[5]++;
            moveFocus(position);
        }
        if (buttons[33].getText().toString().equals("O") && buttons[42].getText().toString().equals("O") && buttons[51].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[5]++;
            moveFocus(position);
        }
        if (buttons[34].getText().toString().equals("O") && buttons[43].getText().toString().equals("O") && buttons[52].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[5]++;
            moveFocus(position);
        }
        if (buttons[35].getText().toString().equals("O") && buttons[44].getText().toString().equals("O") && buttons[53].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[5]++;
            moveFocus(position);
        }
        if (buttons[33].getText().toString().equals("O") && buttons[43].getText().toString().equals("O") && buttons[53].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[5]++;
            moveFocus(position);
        }
        if (buttons[35].getText().toString().equals("O") && buttons[43].getText().toString().equals("O") && buttons[51].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[5]++;
            moveFocus(position);
        }
    }
    /**
     * This method checks if the grid has been won by a player
     * @param position the location of the grid
     */
    public void checkGridSevenWins(int position)
    {
        //check for X wins
        if (buttons[54].getText().toString().equals("X") && buttons[55].getText().toString().equals("X") && buttons[56].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[6]++;
            moveFocus(position);

        }
        if (buttons[63].getText().toString().equals("X") && buttons[64].getText().toString().equals("X") && buttons[65].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[6]++;
            moveFocus(position);


        }
        if (buttons[72].getText().toString().equals("X") && buttons[73].getText().toString().equals("X") && buttons[74].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[6]++;
            moveFocus(position);

        }
        if (buttons[54].getText().toString().equals("X") && buttons[63].getText().toString().equals("X") && buttons[72].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }

            xWins[6]++;
            moveFocus(position);
        }
        if (buttons[55].getText().toString().equals("X") && buttons[64].getText().toString().equals("X") && buttons[73].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[6]++;
            moveFocus(position);
        }
        if (buttons[56].getText().toString().equals("X") && buttons[65].getText().toString().equals("X") && buttons[74].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[6]++;
            moveFocus(position);
        }
        if (buttons[54].getText().toString().equals("X") && buttons[64].getText().toString().equals("X") && buttons[74].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[6]++;
            moveFocus(position);
        }
        if (buttons[56].getText().toString().equals("X") && buttons[64].getText().toString().equals("X") && buttons[72].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[6]++;
            moveFocus(position);
        }


        //check for O wins
        if (buttons[55].getText().toString().equals("O") && buttons[56].getText().toString().equals("O") && buttons[57].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[6]++;
            moveFocus(position);

        }
        if (buttons[63].getText().toString().equals("O") && buttons[64].getText().toString().equals("O") && buttons[65].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[6]++;
            moveFocus(position);
        }
        if (buttons[72].getText().toString().equals("O") && buttons[73].getText().toString().equals("O") && buttons[74].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[6]++;
            moveFocus(position);
        }
        if (buttons[54].getText().toString().equals("O") && buttons[63].getText().toString().equals("O") && buttons[72].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[6]++;
            moveFocus(position);
        }
        if (buttons[55].getText().toString().equals("O") && buttons[64].getText().toString().equals("O") && buttons[73].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[6]++;
            moveFocus(position);
        }
        if (buttons[56].getText().toString().equals("O") && buttons[65].getText().toString().equals("O") && buttons[74].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[6]++;
            moveFocus(position);
        }
        if (buttons[55].getText().toString().equals("O") && buttons[64].getText().toString().equals("O") && buttons[74].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[6]++;
            moveFocus(position);
        }
        if (buttons[56].getText().toString().equals("O") && buttons[64].getText().toString().equals("O") && buttons[72].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[6]++;
            moveFocus(position);
        }
    }
    /**
     * This method checks if the grid has been won by a player
     * @param position the location of the grid
     */
    public void checkGridEightWins(int position)
    {
        //check for X wins
        if (buttons[57].getText().toString().equals("X") && buttons[58].getText().toString().equals("X") && buttons[59].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[7]++;
            moveFocus(position);

        }
        if (buttons[66].getText().toString().equals("X") && buttons[67].getText().toString().equals("X") && buttons[68].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[7]++;
            moveFocus(position);


        }
        if (buttons[75].getText().toString().equals("X") && buttons[76].getText().toString().equals("X") && buttons[77].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[7]++;
            moveFocus(position);

        }
        if (buttons[57].getText().toString().equals("X") && buttons[66].getText().toString().equals("X") && buttons[75].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }

            xWins[7]++;
            moveFocus(position);
        }
        if (buttons[58].getText().toString().equals("X") && buttons[67].getText().toString().equals("X") && buttons[76].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[7]++;
            moveFocus(position);
        }
        if (buttons[59].getText().toString().equals("X") && buttons[68].getText().toString().equals("X") && buttons[77].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[7]++;
            moveFocus(position);
        }
        if (buttons[57].getText().toString().equals("X") && buttons[67].getText().toString().equals("X") && buttons[77].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[7]++;
            moveFocus(position);
        }
        if (buttons[59].getText().toString().equals("X") && buttons[67].getText().toString().equals("X") && buttons[75].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[7]++;
            moveFocus(position);
        }


        //check for O wins
        if (buttons[57].getText().toString().equals("O") && buttons[58].getText().toString().equals("O") && buttons[59].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[7]++;
            moveFocus(position);

        }
        if (buttons[66].getText().toString().equals("O") && buttons[67].getText().toString().equals("O") && buttons[68].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[7]++;
            moveFocus(position);
        }
        if (buttons[75].getText().toString().equals("O") && buttons[76].getText().toString().equals("O") && buttons[77].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[7]++;
            moveFocus(position);
        }
        if (buttons[57].getText().toString().equals("O") && buttons[66].getText().toString().equals("O") && buttons[75].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[7]++;
            moveFocus(position);
        }
        if (buttons[58].getText().toString().equals("O") && buttons[67].getText().toString().equals("O") && buttons[76].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[7]++;
            moveFocus(position);
        }
        if (buttons[59].getText().toString().equals("O") && buttons[68].getText().toString().equals("O") && buttons[77].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[7]++;
            moveFocus(position);
        }
        if (buttons[57].getText().toString().equals("O") && buttons[67].getText().toString().equals("O") && buttons[77].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[7]++;
            moveFocus(position);
        }
        if (buttons[59].getText().toString().equals("O") && buttons[67].getText().toString().equals("O") && buttons[75].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77)  {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[7]++;
            moveFocus(position);
        }
    }
    /**
     * This method checks if the grid has been won by a player
     * @param position the location of the grid
     */
    public void checkGridNineWins(int position)
    {
        //check for X wins
        if (buttons[60].getText().toString().equals("X") && buttons[61].getText().toString().equals("X") && buttons[62].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[8]++;
            moveFocus(position);

        }
        if (buttons[69].getText().toString().equals("X") && buttons[70].getText().toString().equals("X") && buttons[71].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[8]++;
            moveFocus(position);
        }
        if (buttons[78].getText().toString().equals("X") && buttons[79].getText().toString().equals("X") && buttons[80].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[8]++;
            moveFocus(position);

        }
        if (buttons[60].getText().toString().equals("X") && buttons[69].getText().toString().equals("X") && buttons[78].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }

            xWins[8]++;
            moveFocus(position);
        }
        if (buttons[61].getText().toString().equals("X") && buttons[70].getText().toString().equals("X") && buttons[79].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[8]++;
            moveFocus(position);
        }
        if (buttons[62].getText().toString().equals("X") && buttons[71].getText().toString().equals("X") && buttons[80].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[8]++;
            moveFocus(position);
        }
        if (buttons[60].getText().toString().equals("X") && buttons[70].getText().toString().equals("X") && buttons[80].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[8]++;
            moveFocus(position);
        }
        if (buttons[62].getText().toString().equals("X") && buttons[70].getText().toString().equals("X") && buttons[78].getText().toString().equals("X")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player1Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            xWins[8]++;
            moveFocus(position);
        }


        //check for O wins
        if (buttons[60].getText().toString().equals("O") && buttons[61].getText().toString().equals("O") && buttons[62].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[8]++;
            moveFocus(position);

        }
        if (buttons[69].getText().toString().equals("O") && buttons[70].getText().toString().equals("O") && buttons[71].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[8]++;
            moveFocus(position);
        }
        if (buttons[78].getText().toString().equals("O") && buttons[79].getText().toString().equals("O") && buttons[80].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[8]++;
            moveFocus(position);
        }
        if (buttons[60].getText().toString().equals("O") && buttons[69].getText().toString().equals("O") && buttons[78].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[8]++;
            moveFocus(position);
        }
        if (buttons[61].getText().toString().equals("O") && buttons[70].getText().toString().equals("O") && buttons[79].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[8]++;
            moveFocus(position);
        }
        if (buttons[62].getText().toString().equals("O") && buttons[71].getText().toString().equals("O") && buttons[80].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[8]++;
            moveFocus(position);
        }
        if (buttons[60].getText().toString().equals("O") && buttons[70].getText().toString().equals("O") && buttons[80].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[8]++;
            moveFocus(position);
        }
        if (buttons[62].getText().toString().equals("O") && buttons[70].getText().toString().equals("O") && buttons[78].getText().toString().equals("O")) {
            for (int i = 0; i < buttons.length; i++) {
                if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80){
                    buttons[i].setOnClickListener(null);
                    buttons[i].setBackgroundResource(R.color.player2Win);
                    continue;
                }
                buttons[i].setBackgroundResource(R.color.buttonFocus);
                buttons[i].setClickable(true);
            }
            oWins[8]++;
            moveFocus(position);
        }
    }
    /**
     * This method check if the grid is available
     * @param position the grid being checked
     * @return true if the grid is not available else return false
     */
    public boolean oCheckCellGridAvailability(int position)
    {
        //O check
        if(position == 1) {
            if (oWins[0] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                        buttons[i].setBackgroundResource(R.color.player2Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                    //break;
                }
                return true;
            }
        }
        if(position == 2) {
            if (oWins[1] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                        buttons[i].setBackgroundResource(R.color.player2Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 3) {
            if (oWins[2] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                        buttons[i].setBackgroundResource(R.color.player2Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 4) {
            if (oWins[3] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                        buttons[i].setBackgroundResource(R.color.player2Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 5) {
            if (oWins[4] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                        buttons[i].setBackgroundResource(R.color.player2Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 6) {
            if (oWins[5] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                        buttons[i].setBackgroundResource(R.color.player2Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 7) {
            if (oWins[6] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                        buttons[i].setBackgroundResource(R.color.player2Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 8) {
            if (oWins[7] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77) {
                        buttons[i].setBackgroundResource(R.color.player2Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 9) {
            if (oWins[8] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                        buttons[i].setBackgroundResource(R.color.player2Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }

        return false;
    }
    /**
     * This method check if the grid is available
     * @param position the grid being checked
     * @return true if the grid is not available else return false
     */
    public boolean xCheckCellGridAvailability(int position)
    {
        //X check
        if(position == 1) {
            if (xWins[0] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i == 20) {
                        buttons[i].setBackgroundResource(R.color.player1Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                    //break;
                }
                return true;
            }
        }
        if(position == 2) {
            if (xWins[1] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i == 23) {
                        buttons[i].setBackgroundResource(R.color.player1Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 3) {
            if (xWins[2] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i == 26) {
                        buttons[i].setBackgroundResource(R.color.player1Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 4) {
            if (xWins[3] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i == 47) {
                        buttons[i].setBackgroundResource(R.color.player1Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 5) {
            if (xWins[4] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i == 50) {
                        buttons[i].setBackgroundResource(R.color.player1Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 6) {
            if (xWins[5] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i == 53) {
                        buttons[i].setBackgroundResource(R.color.player1Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 7) {
            if (xWins[6] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i == 74) {
                        buttons[i].setBackgroundResource(R.color.player1Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 8) {
            if (xWins[7] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i == 77) {
                        buttons[i].setBackgroundResource(R.color.player1Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        if(position == 9) {
            if (xWins[8] > 0) {
                for (int i = 0; i < buttons.length; i++) {
                    if (i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i == 80) {
                        buttons[i].setBackgroundResource(R.color.player1Win);
                        buttons[i].setClickable(false);
                        continue;
                    }
                    buttons[i].setBackgroundResource(R.color.buttonFocus);
                    buttons[i].setClickable(true);
                }
                return true;
            }
        }
        return false;
    }
    /**
     * This method specifies that the gird is taken
     * @param player which specifies who has taken the grid
     */
    public void gridOneTaken(String player)
    {
        if(player == "O") {
            buttons[0].setBackgroundResource(R.color.player2Win);
            buttons[1].setBackgroundResource(R.color.player2Win);
            buttons[2].setBackgroundResource(R.color.player2Win);
            buttons[9].setBackgroundResource(R.color.player2Win);
            buttons[10].setBackgroundResource(R.color.player2Win);
            buttons[11].setBackgroundResource(R.color.player2Win);
            buttons[18].setBackgroundResource(R.color.player2Win);
            buttons[19].setBackgroundResource(R.color.player2Win);
            buttons[20].setBackgroundResource(R.color.player2Win);
            buttons[0].setOnClickListener(null);
            buttons[1].setOnClickListener(null);
            buttons[2].setOnClickListener(null);
            buttons[9].setOnClickListener(null);
            buttons[10].setOnClickListener(null);
            buttons[11].setOnClickListener(null);
            buttons[18].setOnClickListener(null);
            buttons[19].setOnClickListener(null);
            buttons[20].setOnClickListener(null);
        }
        if(player == "X")
        {
            buttons[0].setBackgroundResource(R.color.player1Win);
            buttons[1].setBackgroundResource(R.color.player1Win);
            buttons[2].setBackgroundResource(R.color.player1Win);
            buttons[9].setBackgroundResource(R.color.player1Win);
            buttons[10].setBackgroundResource(R.color.player1Win);
            buttons[11].setBackgroundResource(R.color.player1Win);
            buttons[18].setBackgroundResource(R.color.player1Win);
            buttons[19].setBackgroundResource(R.color.player1Win);
            buttons[20].setBackgroundResource(R.color.player1Win);
            buttons[0].setOnClickListener(null);
            buttons[1].setOnClickListener(null);
            buttons[2].setOnClickListener(null);
            buttons[9].setOnClickListener(null);
            buttons[10].setOnClickListener(null);
            buttons[11].setOnClickListener(null);
            buttons[18].setOnClickListener(null);
            buttons[19].setOnClickListener(null);
            buttons[20].setOnClickListener(null);
        }
    }
    /**
     * This method specifies that the gird is taken
     * @param player which specifies who has taken the grid
     */
    public void gridTwoTaken(String player)
    {
        if(player == "O") {
            buttons[3].setBackgroundResource(R.color.player2Win);
            buttons[12].setBackgroundResource(R.color.player2Win);
            buttons[21].setBackgroundResource(R.color.player2Win);
            buttons[4].setBackgroundResource(R.color.player2Win);
            buttons[13].setBackgroundResource(R.color.player2Win);
            buttons[22].setBackgroundResource(R.color.player2Win);
            buttons[5].setBackgroundResource(R.color.player2Win);
            buttons[14].setBackgroundResource(R.color.player2Win);
            buttons[23].setBackgroundResource(R.color.player2Win);
            buttons[3].setOnClickListener(null);
            buttons[12].setOnClickListener(null);
            buttons[21].setOnClickListener(null);
            buttons[4].setOnClickListener(null);
            buttons[13].setOnClickListener(null);
            buttons[22].setOnClickListener(null);
            buttons[5].setOnClickListener(null);
            buttons[14].setOnClickListener(null);
            buttons[23].setOnClickListener(null);
        }
        if(player == "X"){
            buttons[3].setBackgroundResource(R.color.player1Win);
            buttons[12].setBackgroundResource(R.color.player1Win);
            buttons[21].setBackgroundResource(R.color.player1Win);
            buttons[4].setBackgroundResource(R.color.player1Win);
            buttons[13].setBackgroundResource(R.color.player1Win);
            buttons[22].setBackgroundResource(R.color.player1Win);
            buttons[5].setBackgroundResource(R.color.player1Win);
            buttons[14].setBackgroundResource(R.color.player1Win);
            buttons[23].setBackgroundResource(R.color.player1Win);
            buttons[3].setOnClickListener(null);
            buttons[12].setOnClickListener(null);
            buttons[21].setOnClickListener(null);
            buttons[4].setOnClickListener(null);
            buttons[13].setOnClickListener(null);
            buttons[22].setOnClickListener(null);
            buttons[5].setOnClickListener(null);
            buttons[14].setOnClickListener(null);
            buttons[23].setOnClickListener(null);
        }
    }
    /**
     * This method specifies that the gird is taken
     * @param player which specifies who has taken the grid
     */
    public void gridThreeTaken(String player)
    {
        if(player == "O") {
            buttons[6].setBackgroundResource(R.color.player2Win);
            buttons[15].setBackgroundResource(R.color.player2Win);
            buttons[24].setBackgroundResource(R.color.player2Win);
            buttons[7].setBackgroundResource(R.color.player2Win);
            buttons[16].setBackgroundResource(R.color.player2Win);
            buttons[25].setBackgroundResource(R.color.player2Win);
            buttons[8].setBackgroundResource(R.color.player2Win);
            buttons[17].setBackgroundResource(R.color.player2Win);
            buttons[26].setBackgroundResource(R.color.player2Win);
            buttons[6].setOnClickListener(null);
            buttons[15].setOnClickListener(null);
            buttons[24].setOnClickListener(null);
            buttons[7].setOnClickListener(null);
            buttons[16].setOnClickListener(null);
            buttons[25].setOnClickListener(null);
            buttons[8].setOnClickListener(null);
            buttons[17].setOnClickListener(null);
            buttons[26].setOnClickListener(null);
        }
        if(player == "X") {
            buttons[6].setBackgroundResource(R.color.player1Win);
            buttons[15].setBackgroundResource(R.color.player1Win);
            buttons[24].setBackgroundResource(R.color.player1Win);
            buttons[7].setBackgroundResource(R.color.player1Win);
            buttons[16].setBackgroundResource(R.color.player1Win);
            buttons[25].setBackgroundResource(R.color.player1Win);
            buttons[8].setBackgroundResource(R.color.player1Win);
            buttons[17].setBackgroundResource(R.color.player1Win);
            buttons[26].setBackgroundResource(R.color.player1Win);
            buttons[6].setOnClickListener(null);
            buttons[15].setOnClickListener(null);
            buttons[24].setOnClickListener(null);
            buttons[7].setOnClickListener(null);
            buttons[16].setOnClickListener(null);
            buttons[25].setOnClickListener(null);
            buttons[8].setOnClickListener(null);
            buttons[17].setOnClickListener(null);
            buttons[26].setOnClickListener(null);
        }
    }
    /**
     * This method specifies that the gird is taken
     * @param player which specifies who has taken the grid
     */
    public void gridFourTaken(String player)
    {
        if(player == "O") {
            buttons[27].setBackgroundResource(R.color.player2Win);
            buttons[28].setBackgroundResource(R.color.player2Win);
            buttons[29].setBackgroundResource(R.color.player2Win);
            buttons[36].setBackgroundResource(R.color.player2Win);
            buttons[37].setBackgroundResource(R.color.player2Win);
            buttons[38].setBackgroundResource(R.color.player2Win);
            buttons[45].setBackgroundResource(R.color.player2Win);
            buttons[46].setBackgroundResource(R.color.player2Win);
            buttons[47].setBackgroundResource(R.color.player2Win);
            buttons[27].setOnClickListener(null);
            buttons[28].setOnClickListener(null);
            buttons[29].setOnClickListener(null);
            buttons[36].setOnClickListener(null);
            buttons[37].setOnClickListener(null);
            buttons[38].setOnClickListener(null);
            buttons[45].setOnClickListener(null);
            buttons[46].setOnClickListener(null);
            buttons[47].setOnClickListener(null);
        }
        if(player == "X") {
            buttons[27].setBackgroundResource(R.color.player1Win);
            buttons[28].setBackgroundResource(R.color.player1Win);
            buttons[29].setBackgroundResource(R.color.player1Win);
            buttons[36].setBackgroundResource(R.color.player1Win);
            buttons[37].setBackgroundResource(R.color.player1Win);
            buttons[38].setBackgroundResource(R.color.player1Win);
            buttons[45].setBackgroundResource(R.color.player1Win);
            buttons[46].setBackgroundResource(R.color.player1Win);
            buttons[47].setBackgroundResource(R.color.player1Win);
            buttons[27].setOnClickListener(null);
            buttons[28].setOnClickListener(null);
            buttons[29].setOnClickListener(null);
            buttons[36].setOnClickListener(null);
            buttons[37].setOnClickListener(null);
            buttons[38].setOnClickListener(null);
            buttons[45].setOnClickListener(null);
            buttons[46].setOnClickListener(null);
            buttons[47].setOnClickListener(null);
        }
    }
    /**
     * This method specifies that the gird is taken
     * @param player which specifies who has taken the grid
     */
    public void gridFiveTaken(String player)
    {
        if(player == "O") {
            buttons[30].setBackgroundResource(R.color.player2Win);
            buttons[31].setBackgroundResource(R.color.player2Win);
            buttons[32].setBackgroundResource(R.color.player2Win);
            buttons[39].setBackgroundResource(R.color.player2Win);
            buttons[40].setBackgroundResource(R.color.player2Win);
            buttons[41].setBackgroundResource(R.color.player2Win);
            buttons[48].setBackgroundResource(R.color.player2Win);
            buttons[49].setBackgroundResource(R.color.player2Win);
            buttons[50].setBackgroundResource(R.color.player2Win);
            buttons[30].setOnClickListener(null);
            buttons[31].setOnClickListener(null);
            buttons[32].setOnClickListener(null);
            buttons[39].setOnClickListener(null);
            buttons[40].setOnClickListener(null);
            buttons[41].setOnClickListener(null);
            buttons[48].setOnClickListener(null);
            buttons[49].setOnClickListener(null);
            buttons[50].setOnClickListener(null);
        }
        if(player == "X") {
            buttons[30].setBackgroundResource(R.color.player1Win);
            buttons[31].setBackgroundResource(R.color.player1Win);
            buttons[32].setBackgroundResource(R.color.player1Win);
            buttons[39].setBackgroundResource(R.color.player1Win);
            buttons[40].setBackgroundResource(R.color.player1Win);
            buttons[41].setBackgroundResource(R.color.player1Win);
            buttons[48].setBackgroundResource(R.color.player1Win);
            buttons[49].setBackgroundResource(R.color.player1Win);
            buttons[50].setBackgroundResource(R.color.player1Win);
            buttons[30].setOnClickListener(null);
            buttons[31].setOnClickListener(null);
            buttons[32].setOnClickListener(null);
            buttons[39].setOnClickListener(null);
            buttons[40].setOnClickListener(null);
            buttons[41].setOnClickListener(null);
            buttons[48].setOnClickListener(null);
            buttons[49].setOnClickListener(null);
            buttons[50].setOnClickListener(null);
        }
    }
    /**
     * This method specifies that the gird is taken
     * @param player which specifies who has taken the grid
     */
    public void gridSixTaken(String player)
    {
        if(player == "O") {
            buttons[33].setBackgroundResource(R.color.player2Win);
            buttons[34].setBackgroundResource(R.color.player2Win);
            buttons[35].setBackgroundResource(R.color.player2Win);
            buttons[42].setBackgroundResource(R.color.player2Win);
            buttons[43].setBackgroundResource(R.color.player2Win);
            buttons[44].setBackgroundResource(R.color.player2Win);
            buttons[51].setBackgroundResource(R.color.player2Win);
            buttons[52].setBackgroundResource(R.color.player2Win);
            buttons[53].setBackgroundResource(R.color.player2Win);
            buttons[33].setOnClickListener(null);
            buttons[34].setOnClickListener(null);
            buttons[35].setOnClickListener(null);
            buttons[42].setOnClickListener(null);
            buttons[43].setOnClickListener(null);
            buttons[44].setOnClickListener(null);
            buttons[51].setOnClickListener(null);
            buttons[52].setOnClickListener(null);
            buttons[53].setOnClickListener(null);
        }
        if(player == "X") {
            buttons[33].setBackgroundResource(R.color.player1Win);
            buttons[34].setBackgroundResource(R.color.player1Win);
            buttons[35].setBackgroundResource(R.color.player1Win);
            buttons[42].setBackgroundResource(R.color.player1Win);
            buttons[43].setBackgroundResource(R.color.player1Win);
            buttons[44].setBackgroundResource(R.color.player1Win);
            buttons[51].setBackgroundResource(R.color.player1Win);
            buttons[52].setBackgroundResource(R.color.player1Win);
            buttons[53].setBackgroundResource(R.color.player1Win);
            buttons[33].setOnClickListener(null);
            buttons[34].setOnClickListener(null);
            buttons[35].setOnClickListener(null);
            buttons[42].setOnClickListener(null);
            buttons[43].setOnClickListener(null);
            buttons[44].setOnClickListener(null);
            buttons[51].setOnClickListener(null);
            buttons[52].setOnClickListener(null);
            buttons[53].setOnClickListener(null);
        }
    }
    /**
     * This method specifies that the gird is taken
     * @param player which specifies who has taken the grid
     */
    public void gridSevenTaken(String player)
    {
        if(player == "O") {
            buttons[54].setBackgroundResource(R.color.player2Win);
            buttons[55].setBackgroundResource(R.color.player2Win);
            buttons[56].setBackgroundResource(R.color.player2Win);
            buttons[63].setBackgroundResource(R.color.player2Win);
            buttons[64].setBackgroundResource(R.color.player2Win);
            buttons[65].setBackgroundResource(R.color.player2Win);
            buttons[72].setBackgroundResource(R.color.player2Win);
            buttons[73].setBackgroundResource(R.color.player2Win);
            buttons[74].setBackgroundResource(R.color.player2Win);
            buttons[54].setOnClickListener(null);
            buttons[55].setOnClickListener(null);
            buttons[56].setOnClickListener(null);
            buttons[63].setOnClickListener(null);
            buttons[64].setOnClickListener(null);
            buttons[65].setOnClickListener(null);
            buttons[72].setOnClickListener(null);
            buttons[73].setOnClickListener(null);
            buttons[74].setOnClickListener(null);
        }
        if(player == "X") {
            buttons[54].setBackgroundResource(R.color.player1Win);
            buttons[55].setBackgroundResource(R.color.player1Win);
            buttons[56].setBackgroundResource(R.color.player1Win);
            buttons[63].setBackgroundResource(R.color.player1Win);
            buttons[64].setBackgroundResource(R.color.player1Win);
            buttons[65].setBackgroundResource(R.color.player1Win);
            buttons[72].setBackgroundResource(R.color.player1Win);
            buttons[73].setBackgroundResource(R.color.player1Win);
            buttons[74].setBackgroundResource(R.color.player1Win);
            buttons[54].setOnClickListener(null);
            buttons[55].setOnClickListener(null);
            buttons[56].setOnClickListener(null);
            buttons[63].setOnClickListener(null);
            buttons[64].setOnClickListener(null);
            buttons[65].setOnClickListener(null);
            buttons[72].setOnClickListener(null);
            buttons[73].setOnClickListener(null);
            buttons[74].setOnClickListener(null);
        }
    }
    /**
     * This method specifies that the gird is taken
     * @param player which specifies who has taken the grid
     */
    public void gridEightTaken(String player)
    {
        if(player == "O") {
            buttons[57].setBackgroundResource(R.color.player2Win);
            buttons[58].setBackgroundResource(R.color.player2Win);
            buttons[59].setBackgroundResource(R.color.player2Win);
            buttons[66].setBackgroundResource(R.color.player2Win);
            buttons[67].setBackgroundResource(R.color.player2Win);
            buttons[68].setBackgroundResource(R.color.player2Win);
            buttons[75].setBackgroundResource(R.color.player2Win);
            buttons[76].setBackgroundResource(R.color.player2Win);
            buttons[77].setBackgroundResource(R.color.player2Win);
            buttons[57].setOnClickListener(null);
            buttons[58].setOnClickListener(null);
            buttons[59].setOnClickListener(null);
            buttons[66].setOnClickListener(null);
            buttons[67].setOnClickListener(null);
            buttons[68].setOnClickListener(null);
            buttons[75].setOnClickListener(null);
            buttons[76].setOnClickListener(null);
            buttons[77].setOnClickListener(null);
        }
        if(player == "X") {
            buttons[57].setBackgroundResource(R.color.player1Win);
            buttons[58].setBackgroundResource(R.color.player1Win);
            buttons[59].setBackgroundResource(R.color.player1Win);
            buttons[66].setBackgroundResource(R.color.player1Win);
            buttons[67].setBackgroundResource(R.color.player1Win);
            buttons[68].setBackgroundResource(R.color.player1Win);
            buttons[75].setBackgroundResource(R.color.player1Win);
            buttons[76].setBackgroundResource(R.color.player1Win);
            buttons[77].setBackgroundResource(R.color.player1Win);
            buttons[57].setOnClickListener(null);
            buttons[58].setOnClickListener(null);
            buttons[59].setOnClickListener(null);
            buttons[66].setOnClickListener(null);
            buttons[67].setOnClickListener(null);
            buttons[68].setOnClickListener(null);
            buttons[75].setOnClickListener(null);
            buttons[76].setOnClickListener(null);
            buttons[77].setOnClickListener(null);
        }
    }
    /**
     * This method specifies that the gird is taken
     * @param player which specifies who has taken the grid
     */
    public void gridNineTaken(String player)
    {
        if(player == "O") {
            buttons[60].setBackgroundResource(R.color.player2Win);
            buttons[61].setBackgroundResource(R.color.player2Win);
            buttons[62].setBackgroundResource(R.color.player2Win);
            buttons[69].setBackgroundResource(R.color.player2Win);
            buttons[70].setBackgroundResource(R.color.player2Win);
            buttons[71].setBackgroundResource(R.color.player2Win);
            buttons[78].setBackgroundResource(R.color.player2Win);
            buttons[79].setBackgroundResource(R.color.player2Win);
            buttons[80].setBackgroundResource(R.color.player2Win);
            buttons[60].setOnClickListener(null);
            buttons[61].setOnClickListener(null);
            buttons[62].setOnClickListener(null);
            buttons[69].setOnClickListener(null);
            buttons[70].setOnClickListener(null);
            buttons[71].setOnClickListener(null);
            buttons[78].setOnClickListener(null);
            buttons[79].setOnClickListener(null);
            buttons[80].setOnClickListener(null);
        }
        if(player == "X") {
            buttons[60].setBackgroundResource(R.color.player1Win);
            buttons[61].setBackgroundResource(R.color.player1Win);
            buttons[62].setBackgroundResource(R.color.player1Win);
            buttons[69].setBackgroundResource(R.color.player1Win);
            buttons[70].setBackgroundResource(R.color.player1Win);
            buttons[71].setBackgroundResource(R.color.player1Win);
            buttons[78].setBackgroundResource(R.color.player1Win);
            buttons[79].setBackgroundResource(R.color.player1Win);
            buttons[80].setBackgroundResource(R.color.player1Win);
            buttons[60].setOnClickListener(null);
            buttons[61].setOnClickListener(null);
            buttons[62].setOnClickListener(null);
            buttons[69].setOnClickListener(null);
            buttons[70].setOnClickListener(null);
            buttons[71].setOnClickListener(null);
            buttons[78].setOnClickListener(null);
            buttons[79].setOnClickListener(null);
            buttons[80].setOnClickListener(null);
        }
    }
    /**
     * This method focuses the board where the user wants to move to
     */
    public void boardOneFocus()
    {
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
                continue;
            }
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
                continue;
            }
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(oCheckIfGridIsTaken(1))
                continue;
            if(xCheckIfGridIsTaken(1))
                continue;
           if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
                continue;
            }
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
                continue;
            }
            if(i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i==19 || i == 20)
                continue;
            buttons[i].setBackgroundResource(R.color.buttonDefault);
            buttons[i].setClickable(false);
        }
    }
    /**
     * This method focuses the board where the user wants to move to
     */
    public void boardTwoFocus()
    {
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
                continue;
            }
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
                continue;
            }
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(oCheckIfGridIsTaken(2))
                continue;
            if(xCheckIfGridIsTaken(2))
                continue;
           if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
                continue;
            }
            if(i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i==22 || i == 23)
                continue;
            buttons[i].setBackgroundResource(R.color.buttonDefault);
            buttons[i].setClickable(false);

        }
    }
    /**
     * This method focuses the board where the user wants to move to
     */
    public void boardThreeFocus()
    {
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
                continue;
            }
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
                continue;
            }
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(oCheckIfGridIsTaken(3))
                continue;
            if(xCheckIfGridIsTaken(3))
                continue;
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            if(i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i==25 || i == 26)
                continue;
            buttons[i].setBackgroundResource(R.color.buttonDefault);
            buttons[i].setClickable(false);
        }
    }
    /**
     * This method focuses the board where the user wants to move to
     */
    public void boardFourFoucs()
    {
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
            }
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(oCheckIfGridIsTaken(4))
                continue;
            if(xCheckIfGridIsTaken(4))
                continue;
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            if(i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i==46 || i == 47)
                continue;
            buttons[i].setBackgroundResource(R.color.buttonDefault);
            buttons[i].setClickable(false);
        }
    }
    /**
     * This method focuses the board where the user wants to move to
     */
    public void boardFiveFoucs()
    {
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
            }
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(oCheckIfGridIsTaken(5))
                continue;
            if(xCheckIfGridIsTaken(5))
                continue;
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            if(i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i==49 || i == 50)
                continue;
            buttons[i].setBackgroundResource(R.color.buttonDefault);
            buttons[i].setClickable(false);
        }

    }
    /**
     * This method focuses the board where the user wants to move to
     */
    public void boardSixFoucs()
    {
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
            }
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(oCheckIfGridIsTaken(6))
                continue;
            if(xCheckIfGridIsTaken(6))
                continue;
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            if(i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i==52 || i == 53)
                continue;
            buttons[i].setBackgroundResource(R.color.buttonDefault);
            buttons[i].setClickable(false);
        }
    }
    /**
     * This method focuses the board where the user wants to move to
     */
    public void boardSevenFoucs()
    {
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
            }
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(oCheckIfGridIsTaken(7))
                continue;
            if(xCheckIfGridIsTaken(7))
                continue;
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            if(i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i==73 || i == 74)
                continue;
            buttons[i].setBackgroundResource(R.color.buttonDefault);
            buttons[i].setClickable(false);
        }
    }
    /**
     * This method focuses the board where the user wants to move to
     */
    public void boardEightFocus()
    {
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
            }
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(oCheckIfGridIsTaken(8))
                continue;
            if(xCheckIfGridIsTaken(8))
                continue;
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            if(i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i==76 || i == 77)
                continue;
            buttons[i].setBackgroundResource(R.color.buttonDefault);
            buttons[i].setClickable(false);
        }
    }
    /**
     * This method focuses the board where the user wants to move to
     */
    public void boardNineFocus()
    {
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(color3 == R.color.player2Win)
            {
                buttons[i].setBackgroundResource(R.color.player2Win);
                buttons[i].setClickable(false);
            }
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            buttons[i].setClickable(true);
            buttons[i].setBackgroundResource(R.color.buttonFocus);
        }
        for (int i = 0; i < buttons.length; i++)
        {
            int color3 = ((ColorDrawable)buttons[i].getBackground()).getColor();
            if(oCheckIfGridIsTaken(9))
                continue;
            if(xCheckIfGridIsTaken(9))
                continue;
            else if(color3 == R.color.player1Win)
            {
                buttons[i].setBackgroundResource(R.color.player1Win);
                buttons[i].setClickable(false);
            }
            if(i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i==79 || i == 80)
                continue;
            buttons[i].setBackgroundResource(R.color.buttonDefault);
            buttons[i].setClickable(false);
        }
    }

    /**
     * This checks if player 2("O") has won or taken a grid
     * @param position the position where the player is trying to move to
     * @return true if the grid is taken else return false
     */
    public boolean oCheckIfGridIsTaken(int position)
    {
        //O wins check
        if(position ==1) {
            if (oWins[0] > 0) {
                gridOneTaken("O");
                return true;
            }
        }
        if(position ==2) {
            if (oWins[1] > 0) {
                gridTwoTaken("O");
                return true;
            }
        }
        if(position ==3) {
            if (oWins[2] > 0) {
                gridThreeTaken("O");
                return true;
            }
        }
        if(position ==4) {
            if (oWins[3] > 0) {
                gridFourTaken("O");
                return true;
            }
        }
        if(position ==5) {
            if (oWins[4] > 0) {
                gridFiveTaken("O");
                return true;
            }
        }
        if(position ==6) {
            if (oWins[5] > 0) {
                gridSixTaken("O");
                return true;
            }
        }
        if(position ==7) {
            if (oWins[6] > 0) {
                gridSevenTaken("O");
                return true;
            }
        }
        if(position ==8) {
            if (oWins[7] > 0) {
                gridEightTaken("O");
                return true;
            }
        }
        if(position ==9) {
            if (oWins[8] > 0) {
                gridNineTaken("O");
                return true;
            }
        }
        return false;
    }
    /**
     * This checks if player 1("X") has won or taken a grid
     * @param position the position where the player is trying to move to
     * @return true if the grid is taken else return false
     */
    public boolean xCheckIfGridIsTaken(int position)
    {
        //X wins check
        if(position == 1) {
            if (xWins[0] > 0) {
                gridOneTaken("X");
                return true;
            }
        }
        if(position == 2) {
            if (xWins[1] > 0) {
                gridTwoTaken("X");
                return true;
            }
        }
        if(position == 3) {
            if (xWins[2] > 0) {
                gridThreeTaken("X");
                return true;
            }
        }
        if(position == 4) {
            if (xWins[3] > 0) {
                gridFourTaken("X");
                return true;
            }
        }
        if(position == 5) {
            if (xWins[4] > 0) {
                gridFiveTaken("X");
                return true;
            }
        }
        if(position == 6) {
            if (xWins[5] > 0) {
                gridSixTaken("X");
                return true;
            }
        }
        if(position == 7) {
            if (xWins[6] > 0) {
                gridSevenTaken("X");
                return true;
            }
        }
        if(position == 8) {
            if (xWins[7] > 0) {
                gridEightTaken("X");
                return true;
            }
        }
        if(position == 9) {
            if (xWins[8] > 0) {
                gridNineTaken("X");
                return true;
            }
        }
        return false;
    }
    /**
     * Thsi method changes the focus on the board and only allows the user to play at the focused grid
     * @param position the position of the board
     */
    public void moveFocus(int position)
    {
        if(position == 1)
            boardOneFocus();
        if(position == 2)
            boardTwoFocus();
        if(position == 3)
            boardThreeFocus();
        if(position == 4)
            boardFourFoucs();
        if(position == 5)
            boardFiveFoucs();
        if(position == 6)
            boardSixFoucs();
        if(position == 7)
            boardSevenFoucs();
        if(position == 8)
            boardEightFocus();
        if(position == 9)
            boardNineFocus();
    }

    /**
     * This method disables all the buttons on the board
     */
    public void disableAllButtons()
    {
        for (int i =0; i<buttons.length; i++)
        {
            buttons[i].setEnabled(false);
            buttons[i].setBackgroundResource(R.color.buttonDefault);
        }
    }

    /**
     * This method checks if the game has been won by player 1 ("X") which is player
     */
    public void xCheckGameWon()
    {
        TextView winner = (TextView) findViewById(R.id.winner);

        if(xWins[0]==1&&xWins[1]==1&&xWins[2]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER X WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);
        }
        if(xWins[3]==1&&xWins[4]==1&&xWins[5]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER X WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);
        }
        if(xWins[6]==1&&xWins[7]==1&&xWins[8]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER X WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);
        }
        if(xWins[0]==1&&xWins[3]==1&&xWins[6]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER X WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);
        }

        if(xWins[1]==1&&xWins[4]==1&&xWins[7]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER X WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);
        }
        if(xWins[2]==1&&xWins[5]==1&&xWins[8]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER X WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);
        }
        if(xWins[0]==1&&xWins[4]==1&&xWins[8]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER X WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);
        }
        if(xWins[2]==1&&xWins[4]==1&&xWins[6]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER X WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);
        }
    }

    /**
     * This method checks if player 2 ("0") has won the game
     */
    public void oCheckGameWon()
    {
        TextView winner = (TextView) findViewById(R.id.winner);

        if(oWins[0]==1&&oWins[1]==1&&oWins[2]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER O WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);

        }
        if(oWins[3]==1&&oWins[4]==1&&oWins[5]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER O WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);

        }
        if(oWins[6]==1&&oWins[7]==1&&oWins[8]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER O WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);

        }
        if(oWins[0]==1&&oWins[3]==1&&oWins[6]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER O WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);

        }
        if(oWins[1]==1&&oWins[4]==1&&oWins[7]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER O WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);

        }
        if(oWins[2]==1&&oWins[5]==1&&oWins[8]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER O WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);

        }
        if(oWins[0]==1&&oWins[4]==1&&oWins[8]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER O WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);

        }
        if(oWins[2]==1&&oWins[4]==1&&oWins[6]==1)
        {
            disableAllButtons();
            winner.setText("PLAYER O WON!!!!!!!");
            winner.setVisibility(View.VISIBLE);
        }
    }
    /**
     * This method checks if there is a draw in the game
     */
    public void draw()
    {
        boolean draw = false;
        TextView winner = (TextView) findViewById(R.id.winner);
        for (int i = 0; i<buttons.length; i++)
        {
            if((buttons[i].getText().toString().equals("X") || buttons[i].getText().toString().equals("O")) && !buttons[i].getText().toString().equals(""))
                draw = true;
            else
                draw = false;
        }
        if(draw)
        {
            disableAllButtons();
            winner.setText("DRAW");
            winner.setVisibility(View.VISIBLE);
        }
        else
            return;
    }
}