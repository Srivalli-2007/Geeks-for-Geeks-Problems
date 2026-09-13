<h2><a href="https://www.geeksforgeeks.org/problems/rearrange-string-as-alternate-x-and-y-occurences3835/1">Make x times 0's and y times 1's</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 20px;">Given a binary string <strong>s</strong> and two integers <strong>x</strong> and <strong>y</strong>. Arrange the given string in such a way so that '0' comes x-times then '1' comes y-times and so on until one of the '0' or '1' is finished. Then concatenate the rest of the string and find the final string.</span></p>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>x = 1, y = 1, s = "0011"
<strong>Output: </strong>"0101"
<strong>Explanation:</strong> we put 1 '0' and 1 '1' alternatively.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>x = 1, y = 1, s = "1011011"
<strong>Output:</strong> "0101111"
<strong>Explanation:</strong> We put '0' and '1' alternatively and in last we have to put all '1' as there is no '0' left.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ x, y ≤ 10<sup>3</sup><br>1 ≤ |s| ≤ 10<sup>5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;