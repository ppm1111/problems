<?

function breakChocolate ($n, $m) {
    if($n == 1 && $m == 1) {
        return 0;
    }
    if($n >= $m) {
        return cut(intVal($n/2), $m) + cut($n-intVal($n/2), $m) + 1;
    }else{
        return cut($n, intVal($m/2)) + cut($n, ($m-intVal($m/2))) + 1;
    }
    
};
  
function cut($n, $m) {
    if($n == 1 && $m == 1) {
        return 0;
    }
    if( ($n == 1 && $m == 2) || ($n == 2 && $m == 1)) {
        return 1;
    }
    if($n >= $m) {
        return cut(intVal($n/2), $m) + cut($n-intVal($n/2), $m) + 1;
    }else{
        return cut($n, intVal($m/2)) + cut($n, ($m-intVal($m/2))) + 1;
    }
}