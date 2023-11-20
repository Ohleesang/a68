package com.example.a68

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * 1 ≤ ingredient의 길이 ≤ 1,000,000
         * ingredient의 원소는 1, 2, 3 중 하나의 값이며,
         * 순서대로 빵, 야채, 고기를 의미합니다.
         * 상수는 빵 야채 고기 빵 , 1231 만 포장 한다.
         */

        class Solution {
            fun solution(ingredient: IntArray): Int {
                var answer: Int = 0
                var hambuger =StringBuilder(ingredient.size)
                for(value in ingredient){
                    hambuger.append(value)
                }
                while(hambuger.length>3){
                    val index = hambuger.indexOf("1231")
                    if (index == -1) break
                    hambuger.delete(index,index+4)
                    answer++
                }

                return answer
            }
        }


        val a = Solution()
        a.solution(intArrayOf(1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1))
        a.solution(intArrayOf(2,1,1,2,3,1,2,3,1))//2
        a.solution(intArrayOf(1,3,2,1,2,1,3,1,2))//0

    }
}