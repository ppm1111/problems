<?php

// Complete the minimumSwaps function below.
function minimumSwaps($arr) {
    $swaps = 0;

    for($a=0;$a<count($arr);$a++) {
        if($arr[$a]-1 !== $a) {
           list($arr[$arr[$a]-1], $arr[$a]) = array($arr[$a], $arr[$arr[$a]-1]);
           $swaps++;
           $a--;
        }
        
    }
    for($a=0;$a<count($arr);$a++) {
        echo $arr[$a]." ";
    }
    return $swaps;
}

$fptr = fopen(getenv("OUTPUT_PATH"), "w");

$stdin = fopen("php://stdin", "r");

fscanf($stdin, "%d\n", $n);

fscanf($stdin, "%[^\n]", $arr_temp);

$arr = array_map('intval', preg_split('/ /', $arr_temp, -1, PREG_SPLIT_NO_EMPTY));

$res = minimumSwaps($arr);

fwrite($fptr, $res . "\n");

fclose($stdin);
fclose($fptr);
