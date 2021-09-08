<?php

require_once('car.php');

class UberVan extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;
    protected $passenger;

    public function __construct($licence, $driver, $typeCarAccepted, $seatsMaterial){
        parent::__construct($licence, $driver);
        $this -> typeCarAccepted = $typeCarAccepted;
        $this -> seatsMaterial = $seatsMaterial;

    }

    public function setPassenger($passenger){
        
        if($passenger == 6){
            $this->passenger = $passenger;
        } else {
            echo "Necesitas asignar 6 pasajeros";
        }
    }

}

?>