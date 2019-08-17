<?php

// Complete the climbingLeaderboard function below.
function climbingLeaderboard($scores, $alice) {
    $scores = array_values(array_unique($scores));
    $s_index = count($scores)-1;
    $result = array();
    for($a=0;$a<count($alice);$a++) {
        while($alice[$a] >= $scores[$s_index] && $s_index >= 0){
            $s_index--;
        }
        array_push($result,($s_index+2));
    }
    return $result;
}

$fptr = fopen(getenv("OUTPUT_PATH"), "w");

$stdin = fopen("php://stdin", "r");

fscanf($stdin, "%d\n", $scores_count);

fscanf($stdin, "%[^\n]", $scores_temp);

$scores = array_map('intval', preg_split('/ /', $scores_temp, -1, PREG_SPLIT_NO_EMPTY));

fscanf($stdin, "%d\n", $alice_count);

fscanf($stdin, "%[^\n]", $alice_temp);

$alice = array_map('intval', preg_split('/ /', $alice_temp, -1, PREG_SPLIT_NO_EMPTY));

$result = climbingLeaderboard($scores, $alice);

fwrite($fptr, implode("\n", $result) . "\n");

fclose($stdin);
fclose($fptr);
