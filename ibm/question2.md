# Packets

Packets are sent to different ports on a computer system based on the hash of their packet ID. The value of the hash is as given below :  
Hash = mod (packet_id, numberOfPorts)  
where mod is the modulus operator and takes the mod of the first operand by second operand.

The ports are numberd from 0 to (number of ports) - 1, and a packet is initially sent to the port that has the port number equal to the hash of its packet ID. Each port requires t secods to process an arriving packet. If a port is currently processing a packet, any arriving packet is rerouted to the next port number, and so on. The list of ports is circular. If a packet arrives at the last port and it is busy, it is rerouted to the first port. Given a list of IDs of n packets that arrive 1 per sencond, find the port to which each packet is finally sent. The first packet is sent at second t = 1.

Each port requires a time t to send a packet. If a port is currently sending a packet, this packet is then sent to the next port number, and so on. Given a list of IDs of n packets that arrive t per sencond, find the port to which is finally sent. The first packet is sent at time t = 1.

## Example  

numberOfPorts = 3  
transmissionTie = 2  
packetIds = [ 4, 7, 10, 6 ]  

The destination ports, assuming no time conflicts are all calculated as packetIds[ i ] modulo numberOfPorts, so [ 1, 1, 1, 0 ] in this case. These arrive at times 1, 2, 3, 4. The first packet is sent to port 1 with no conflicts. Port 1 will be occupied at times 1 and 2 due to the transmission time, so the second packet has a conflict ans is sent to port 1 + 1 = 2. The third packet want to go to port 1 and arrives at time 3. Since port 1 is no longer transmitting packet 1, it receives the third packet. The fourth packet goes to port 0 without conflicts. The return array is [ 1, 2, 1, 0].

## Function Description

Complete the sentTimes function in the editor below

```
sentTimes has the following parameter(s) :  
    int numberOfPorts : the number of ports in the system  
    int transmissionTime : the time for a port to send a packet  
    int packetIds[ n ] : the IDs of the packets in the order in which they arrive  
```

Returns :
```  
    int[ n ] : the ports to which the packets are sent  
```

Constrains

1 ≤ numberOfPorts ≤ 2000  
1 ≤ transmissionTime ≤ 100  
1 ≤ n ≤ 2000  


### Sample Case 0

| STDIN | Function                |
|-------|-------------------------|
| 4     | numberOfPorts = 4       |
| 2     | transmissionTime = 2    |
| 3     | packetIds[] size n = 3  |
| 0     | packetIds = [ 0, 2, 6 ] |
| 2     |                         |
| 6     |                         |

Sample Output : 0 2 3  

Explanation  
According to the hashes, packets should be sent on ports 0, 2 and 2 respectively, but packet 6 arrives at time 3, at which packet 2 is in the process of being sent. Therefore, it is sent to the next port. Return the arraus [ 0, 2, 6 ]

### Sample Case 1

| STDIN | Function                     |
|-------|------------------------------|
| 5     | numberOfPorts = 5            |
| 3     | transmissionTime = 3         |
| 4     | packetIds[] size n = 4       |
| 1     | packetIds = [ 1, 6, 11, 16 ] |
| 6     |                              |
| 11    |                              |
| 16    |                              |

Sample Output : 1 2 3 1

Explanation  
Packet 1 is sent to port 1 at time t = 1, so it will be processed until time = 3  
Packet 6 is sent to port 1 at time t = 2, but port 1 is processing packet 1, so it is sent to port 2
Packet 11 is sent to port 1 at time t = 3, but port 1 is processing packet1 and port 2 is processing packet 6, si it is sent to port 3  
Packet 16 is sent to port 1 at time t = 4, so port 1 is free to process packet 16  

Therefore, the packets are sent to ports 1, 2, 3 and 1, respectively, so the return the array [ 1, 2, 3, 1]  
