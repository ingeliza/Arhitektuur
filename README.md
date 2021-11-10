Amazon SQS

Plussid:

· Hind vastavalt sellele, mida sa kasutad, ehk maksad saadetavate ja loetavate sõnumite eest

· Kerge hakata kasutama

· Tundlike andmeid saab kergesti turvata

· Usaldusväärne – pole vaja karta sõnumite kadumist

Miinused:

· Juhul kui saadetavate sõnumite hulk on suur, on ka hind kõrgem.

· Sul pole nii palju kontrolli sõnumite üle.

· Puudub võimalus sõnumil käivitada Lambda funktsiooni

Apache Kafka

Plussid:

· Mitte väga suure riistvara puhul on Kafka võimeline töötlema suurema kiiruse ning suuremas mahus andmeid.

· Vastupidav, sõnumid ei lähe kaduma

· Veataluvus, Kafka on vastupidav node’i või masina rikke suhtes

· Võimaldab kirjutada ja lugeda sõnumeid samaaegselt

Miinused:

· Vahel on aeglane

· Puudub täielik haldus- ja seiretööriistade komplekt

RabbitMQ

Plussid:

· Suur jõudlus

· Hea dokumentatsioon

· Paindlik marsuutimine

Miinused:

· Ebamäärased veateated

· Mõned aspektid on liiga tehnilised eriti algajate jaoks

Apache Kafkas on võimalus sõnumeid järjestada, kuid RabbitMQ-s see võimalus puudub. Kafkasse jäävad sõnumid alles, kuid RabbitMQs kaob sõnum ära, kui see on loetud.

Githubi link: https://github.com/ingeliza/Arhitektuur/tree/main/kafka/kafka-3.0.0-src

Proovisin kasutada Apache Kafkat, laadisin selle alla ning käivitasin command promptiga bin kaustas käsu:

zookeeper-server-start.sh config/zookeeper.properties

Ning teise command promptiga käsu:

kafka-server-start.sh config/server.properties

Need oleksid vist pidanud käivitama mingid terminalid, kuid mul Git Bash seepeale avanes ja läks kohe ka kinni ning ma ei tea täpselt, mis see probleem oli. Igaljuhul võrreldes ActiveMQ-ga näib setup olevat keerulisem.
