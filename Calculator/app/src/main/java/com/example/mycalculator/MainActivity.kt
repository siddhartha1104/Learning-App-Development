package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var lastNumeric = false
    var lastDot = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onDigit(view: View){
        tvInput.append((view as Button).text)
        lastNumeric = true

//        if(tvInput.text.contains("="))
//            tvInput.text = "Mai nahi Batunga 😂😂😂"
    }

    fun onClear(view: View){
        tvInput.text = ""
        lastNumeric = false
        lastDot = false

    }

    fun onDecimalPoint(view: View){

    //we want to check if the last was Numeric and Not Decimal

        if (lastNumeric && !lastDot){
            tvInput.append(".")

            lastNumeric = false
            lastDot = true
        }
    }

    fun onEqual(view: View){
        // we have to check if the value ends with numeric then only we Run the code
        if (lastNumeric){
            var tvValue = tvInput.text.toString()
            var prefix = ""

            if (tvValue.startsWith("-")){
                prefix = "-"
                tvValue = tvValue.substring(1)
            }

            try {
                //-
                if(tvValue.contains("-")){

                    val splitValue = tvValue.split("-")

                    //99 - 1
                    var one = splitValue[0] //99
                    var two = splitValue[1] //1

                    if(!prefix.isEmpty()){
                        one = prefix + one
                    }

                    tvInput.text = removeZeroAfterDot((one.toDouble() - two.toDouble()).toString())
                }
                // +
                else if(tvValue.contains("+")){

                    val splitValue = tvValue.split("+")


                    var one = splitValue[0] //99
                    var two = splitValue[1] //1

                    if(!prefix.isEmpty()){
                        one = prefix + one
                    }

                    tvInput.text = removeZeroAfterDot((one.toDouble() + two.toDouble()).toString())
                }
                // *
                else if(tvValue.contains("*")){

                    val splitValue = tvValue.split("*")

                    //99 - 1
                    var one = splitValue[0] //99
                    var two = splitValue[1] //1

                    if(!prefix.isEmpty()){
                        one = prefix + one
                    }

                    tvInput.text = removeZeroAfterDot((one.toDouble() * two.toDouble()).toString())
                }
                //    /
                else if(tvValue.contains("/")){

                    val splitValue = tvValue.split("/")

                    //99 - 1
                    var one = splitValue[0] //99
                    var two = splitValue[1] //1

                    if(!prefix.isEmpty()){
                        one = prefix + one
                    }

                    tvInput.text = removeZeroAfterDot((one.toDouble() / two.toDouble()).toString())
                }


            }catch (e: ArithmeticException){
                e.printStackTrace()
            }
        }

    }

//    private fun removeZeroAfterDot(result: String) : String{
//
//    }

    private fun removeZeroAfterDot(result: String) : String {

        var value = result
        if (result.contains(".0"))
            value = result.substring(0, result.length - 2)
            // value  = 99.0
            // index  = [1][2][3][4]
        return value
    }


    /**
     * Append +,-,*,/ operators to the TextView as per the Button.Text
     */
    fun onOperator(view: View){
        if(lastNumeric && !isOperatorAdded(tvInput.text.toString())){
            tvInput.append((view as Button).text)
            lastNumeric = false
            lastDot = false
        }
    }


    /**
     * It is used to check whether any of the operator is used or not.
     */
    private fun isOperatorAdded(value: String) : Boolean{

        /**
         * Here first we will check that if the value starts with "-" then will ignore it.
         * cauz it indicates that the value is Negative Value
         * As it is the result value and perform further calculation.
         */
        return if (value.startsWith("-")){
            false
        }

        /**
         * it will allow us to add only one of the operators
         * but if its "-" at the beginning it still gonna works
         * */

        else{
            value.contains("/") || value.contains("*") || value.contains("+")
                    || value.contains("-")
        }
    }

}