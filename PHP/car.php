<?php
require_once('account.php');

class Car{
    public $id;
    public $licence;
    public $driver;
    protected $passenger;

    public function __construct($licence, $driver){
        $this->licence = $licence;
        $this->driver  = $driver;
    }

    public function printDataCar(){
        echo "licence: $this->licence, passenger: {$this->passenger}";
    }

    public function getPassenger(){
        return $this -> passenger; 
    }

    public function setPassenger($passenger){

        if ($passenger == 4){
            $this -> passenger =  $passenger;
        }
        else {
            echo "Necesitas asignar 4 pasajeros";
        }
    }
}

?>