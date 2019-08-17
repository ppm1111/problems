<?php

// Complete the hourglassSum function below.
function hourglassSum($arr) {

    $max = null;
    for($a=0;$a<count($arr)-2;$a++) {
        for($b=0;$b<count($arr[$a])-2;$b++) {
            $r  = cal($arr, $a, $b);
            if($max === null) {
                $max = $r;
            }
            if($r > $max) {
                $max = $r;
            }
        }   
    }
    
    return $max;
}

function cal($arr, $x, $y) { 
    $result = 0;
    $result += $arr[$x][$y];
    $result += $arr[$x][$y+1];
    $result += $arr[$x][$y+2];
    $result += $arr[$x+1][$y+1];
    $result += $arr[$x+2][$y];
    $result += $arr[$x+2][$y+1];
    $result += $arr[$x+2][$y+2];
    return $result;
}

$fptr = fopen(getenv("OUTPUT_PATH"), "w");

$stdin = fopen("php://stdin", "r");

$arr == array();

for ($i = 0; $i < 6; $i++) {
    fscanf($stdin, "%[^\n]", $arr_temp);
    $arr[] = array_map('intval', preg_split('/ /', $arr_temp, -1, PREG_SPLIT_NO_EMPTY));
}

$result = hourglassSum($arr);

fwrite($fptr, $result . "\n");

fclose($stdin);
fclose($fptr);


/*
test caes
-1 1 -1 0 0 0
0 -1 0 0 0 0
-1 -1 -1 0 0 0
0 -9 2 -4 -4 0
-7 0 0 -2 0 0
0 0 -1 -2 -4 0
output
0
*/