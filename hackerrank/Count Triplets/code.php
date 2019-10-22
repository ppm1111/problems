<?php

// Complete the countTriplets function below.
function countTriplets($arr, $r) {
    $r2 = [];
    $r3 = [];
    $count = 0;
    for($a=0;$a<count($arr);$a++) {
        if(isset($r3[$arr[$a]])) {
            $count += $r3[$arr[$a]];
        }

        if(isset($r2[$arr[$a]])) {
            $r3[$arr[$a]*$r] += $r2[$arr[$a]];
        }
        
        
        $r2[$arr[$a]*$r] += 1;
    }
    return $count;
}

$fptr = fopen(getenv("OUTPUT_PATH"), "w");

$nr = explode(' ', rtrim(fgets(STDIN)));

$n = intval($nr[0]);

$r = intval($nr[1]);

$arr_temp = rtrim(fgets(STDIN));

$arr = array_map('intval', preg_split('/ /', $arr_temp, -1, PREG_SPLIT_NO_EMPTY));

$ans = countTriplets($arr, $r);

fwrite($fptr, $ans . "\n");

fclose($fptr);
