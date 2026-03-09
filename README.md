# Esercitazione C/S UDP Java

# Descrizione
Questo progetto implementa una comunicazione UDP tra un client e un server in Java.
Il client può inviare più messaggi al server e ricevere le risposte.

Il server riceve i pacchetti inviati dai client, legge il contenuto del messaggio e invia una risposta.
E' stato implementato un protocollo semplice testuale dove il client invia messaggi e può terminare il programma scrivendo exit.

A differenza del TCP, il protocollo UDP non stabilisce una connessione tra client e server.
Ogni messaggio viene inviato come datagramma indipendente.

Il progetto è composto dalle seguenti classi:
- ClientUDP che gestisce l'invio dei messaggi al server
- ServerUDP che riceve i messaggi e invia le risposte
- MainClient che avvia il client
- MainServer che avvia il server

# Utilizzo

Si avvia MainServer.
Il server apre un DatagramSocket sulla porta 5000 e rimane in ascolto dei messaggi inviati dai client.

Poi si avvia MainClient.
Il client invia messaggi al server sull'host localhost e porta 5000.

Il client può inviare più messaggi consecutivamente.
Per ogni messaggio inviato il server risponde con un messaggio che contiene la data e l'ora di ricezione.

# Scenari implementati

# Scenario 1: avvio server poi client
Il server viene avviato prima e rimane in attesa.
Il client invia messaggi al server e riceve correttamente le risposte.

# Scenario 2: avvio client poi server
Se il client viene avviato prima del server, l'invio del messaggio non riceve risposta.
Quando il server viene avviato, i messaggi successivi vengono gestiti correttamente.

# Scenario 3: avvio di un secondo server sulla stessa porta
Se si prova ad avviare un secondo server sulla stessa porta, viene generata un'eccezione e viene stampato "Porta già in uso".

# Scenario 4: host errato
Se nel client viene scritto un host errato come "locaost", viene generata un'eccezione e il client termina.

# Scenario 5: più richieste dal client
Il client può inviare più messaggi senza chiudere il programma.
Il server riceve ogni messaggio e invia la risposta corretta.

# Scenario 6: chiusura con comando exit
Se il client scrive exit, il client termina l'esecuzione e chiude il socket.

# Protocollo
Client invia: messaggio di testo  
Server risponde: "Messaggio ricevuto alle: <data e ora>"  
Client scrive exit -> chiusura del client
