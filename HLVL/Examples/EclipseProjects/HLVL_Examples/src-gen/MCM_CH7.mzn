% Autogenerated code form the Coffee framework
% Author: avillota
% Variables from elements definitions 
var 1..7 : cores ;
var {2 , 8 , 16 , 32 }  : size ;
var 0..1: processor ;
var 0..1: feedback ;
var 0..1: memory ;
var 0..1: visual ;
var 0..1: audio ;
var 0..1: vibration ;
var 0..1: sensors ;
var 0..1: positionSensor ;
var 0..1: speedSensor ;
% Variables and constraints from the variability relations definition
constraint processor > 0 ;
constraint sensors > 0 ;
constraint memory > 0 ;
constraint positionSensor > 0 -> sensors > 0 ;
constraint speedSensor > 0 -> sensors > 0 ;
constraint processor > 0 <-> cores > 0 ;
constraint memory > 0 <-> size > 0 ;
n.y.in.y.iconstraint processor > 0 -> memory > 0 ;
constraint vibration * speedSensor = 0 ;
constraint 2 * feedback <= audio + vibration + visual  ;
constraint audio + vibration + visual  <= 3 * feedback ;
% The solving parameters from the parameters files
