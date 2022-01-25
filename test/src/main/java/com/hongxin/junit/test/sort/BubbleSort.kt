package com.hongxin.junit.sorttest.sort

object BubbleSort {

    @JvmStatic
    fun main(args: Array<String>) {
        sort(arr)
    }

    private fun sort(arr: IntArray) {

        var count = 0;
        for (i in arr.indices) {
            var flag = true
            for (j in i until arr.size) {
                if (arr[i] > arr[j]) {
                    var temp = arr[j]
                    arr[j] = arr[i]
                    arr[i] = temp
                    flag = false
                }
                count++
            }
            if (flag) {
                break
            }
        }

        for (i in arr) {
            print("$i   ")
        }
        println()
        println("循环次数 $count")

    }
}