<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/logging/v2/logging_config.proto

namespace GPBMetadata\Google\Logging\V2;

class LoggingConfig
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Api\Client::initOnce();
        \GPBMetadata\Google\Api\FieldBehavior::initOnce();
        \GPBMetadata\Google\Api\Resource::initOnce();
        \GPBMetadata\Google\Protobuf\Duration::initOnce();
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        \GPBMetadata\Google\Protobuf\FieldMask::initOnce();
        \GPBMetadata\Google\Protobuf\Timestamp::initOnce();
        \GPBMetadata\Google\Api\Annotations::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0ada4f0a26676f6f676c652f6c6f6767696e672f76322f6c6f6767696e67" .
            "5f636f6e6669672e70726f746f1211676f6f676c652e6c6f6767696e672e" .
            "76321a1f676f6f676c652f6170692f6669656c645f6265686176696f722e" .
            "70726f746f1a19676f6f676c652f6170692f7265736f757263652e70726f" .
            "746f1a1e676f6f676c652f70726f746f6275662f6475726174696f6e2e70" .
            "726f746f1a1b676f6f676c652f70726f746f6275662f656d7074792e7072" .
            "6f746f1a20676f6f676c652f70726f746f6275662f6669656c645f6d6173" .
            "6b2e70726f746f1a1f676f6f676c652f70726f746f6275662f74696d6573" .
            "74616d702e70726f746f1a1c676f6f676c652f6170692f616e6e6f746174" .
            "696f6e732e70726f746f229b040a094c6f674275636b6574120c0a046e61" .
            "6d6518012001280912130a0b6465736372697074696f6e18032001280912" .
            "340a0b6372656174655f74696d6518042001280b321a2e676f6f676c652e" .
            "70726f746f6275662e54696d657374616d704203e0410312340a0b757064" .
            "6174655f74696d6518052001280b321a2e676f6f676c652e70726f746f62" .
            "75662e54696d657374616d704203e0410312160a0e726574656e74696f6e" .
            "5f64617973180b20012805123f0a0f6c6966656379636c655f7374617465" .
            "180c2001280e32212e676f6f676c652e6c6f6767696e672e76322e4c6966" .
            "656379636c6553746174654203e041033aa502ea41a1020a206c6f676769" .
            "6e672e676f6f676c65617069732e636f6d2f4c6f674275636b6574123870" .
            "726f6a656374732f7b70726f6a6563747d2f6c6f636174696f6e732f7b6c" .
            "6f636174696f6e7d2f6275636b6574732f7b6275636b65747d12426f7267" .
            "616e697a6174696f6e732f7b6f7267616e697a6174696f6e7d2f6c6f6361" .
            "74696f6e732f7b6c6f636174696f6e7d2f6275636b6574732f7b6275636b" .
            "65747d1236666f6c646572732f7b666f6c6465727d2f6c6f636174696f6e" .
            "732f7b6c6f636174696f6e7d2f6275636b6574732f7b6275636b65747d12" .
            "4762696c6c696e674163636f756e74732f7b62696c6c696e675f6163636f" .
            "756e747d2f6c6f636174696f6e732f7b6c6f636174696f6e7d2f6275636b" .
            "6574732f7b6275636b65747d22cb050a074c6f6753696e6b12110a046e61" .
            "6d651801200128094203e04102121e0a0b64657374696e6174696f6e1803" .
            "200128094209e04102fa41030a012a12130a0666696c7465721805200128" .
            "094203e0410112180a0b6465736372697074696f6e1812200128094203e0" .
            "410112150a0864697361626c65641813200128084203e04101124b0a156f" .
            "75747075745f76657273696f6e5f666f726d617418062001280e32282e67" .
            "6f6f676c652e6c6f6767696e672e76322e4c6f6753696e6b2e5665727369" .
            "6f6e466f726d617442021801121c0a0f7772697465725f6964656e746974" .
            "791808200128094203e04103121d0a10696e636c7564655f6368696c6472" .
            "656e1809200128084203e0410112430a1062696771756572795f6f707469" .
            "6f6e73180c2001280b32222e676f6f676c652e6c6f6767696e672e76322e" .
            "42696751756572794f7074696f6e734203e04101480012340a0b63726561" .
            "74655f74696d65180d2001280b321a2e676f6f676c652e70726f746f6275" .
            "662e54696d657374616d704203e0410312340a0b7570646174655f74696d" .
            "65180e2001280b321a2e676f6f676c652e70726f746f6275662e54696d65" .
            "7374616d704203e04103223f0a0d56657273696f6e466f726d6174121e0a" .
            "1a56455253494f4e5f464f524d41545f554e535045434946494544100012" .
            "060a025632100112060a02563110023abf01ea41bb010a1e6c6f6767696e" .
            "672e676f6f676c65617069732e636f6d2f4c6f6753696e6b121f70726f6a" .
            "656374732f7b70726f6a6563747d2f73696e6b732f7b73696e6b7d12296f" .
            "7267616e697a6174696f6e732f7b6f7267616e697a6174696f6e7d2f7369" .
            "6e6b732f7b73696e6b7d121d666f6c646572732f7b666f6c6465727d2f73" .
            "696e6b732f7b73696e6b7d122e62696c6c696e674163636f756e74732f7b" .
            "62696c6c696e675f6163636f756e747d2f73696e6b732f7b73696e6b7d42" .
            "090a076f7074696f6e7322670a0f42696751756572794f7074696f6e7312" .
            "230a167573655f706172746974696f6e65645f7461626c65731801200128" .
            "084203e04101122f0a22757365735f74696d657374616d705f636f6c756d" .
            "6e5f706172746974696f6e696e671803200128084203e04103227f0a124c" .
            "6973744275636b6574735265717565737412380a06706172656e74180120" .
            "0128094228e04102fa412212206c6f6767696e672e676f6f676c65617069" .
            "732e636f6d2f4c6f674275636b657412170a0a706167655f746f6b656e18" .
            "02200128094203e0410112160a09706167655f73697a6518032001280542" .
            "03e04101225d0a134c6973744275636b657473526573706f6e7365122d0a" .
            "076275636b65747318012003280b321c2e676f6f676c652e6c6f6767696e" .
            "672e76322e4c6f674275636b657412170a0f6e6578745f706167655f746f" .
            "6b656e18022001280922b6010a135570646174654275636b657452657175" .
            "65737412360a046e616d651801200128094228e04102fa41220a206c6f67" .
            "67696e672e676f6f676c65617069732e636f6d2f4c6f674275636b657412" .
            "310a066275636b657418022001280b321c2e676f6f676c652e6c6f676769" .
            "6e672e76322e4c6f674275636b65744203e0410212340a0b757064617465" .
            "5f6d61736b18042001280b321a2e676f6f676c652e70726f746f6275662e" .
            "4669656c644d61736b4203e04102224a0a104765744275636b6574526571" .
            "7565737412360a046e616d651801200128094228e04102fa41220a206c6f" .
            "6767696e672e676f6f676c65617069732e636f6d2f4c6f674275636b6574" .
            "227b0a104c69737453696e6b735265717565737412360a06706172656e74" .
            "1801200128094226e04102fa4120121e6c6f6767696e672e676f6f676c65" .
            "617069732e636f6d2f4c6f6753696e6b12170a0a706167655f746f6b656e" .
            "1802200128094203e0410112160a09706167655f73697a65180320012805" .
            "4203e0410122570a114c69737453696e6b73526573706f6e736512290a05" .
            "73696e6b7318012003280b321a2e676f6f676c652e6c6f6767696e672e76" .
            "322e4c6f6753696e6b12170a0f6e6578745f706167655f746f6b656e1802" .
            "20012809224b0a0e47657453696e6b5265717565737412390a0973696e6b" .
            "5f6e616d651801200128094226e04102fa41200a1e6c6f6767696e672e67" .
            "6f6f676c65617069732e636f6d2f4c6f6753696e6b229f010a1143726561" .
            "746553696e6b5265717565737412360a06706172656e7418012001280942" .
            "26e04102fa4120121e6c6f6767696e672e676f6f676c65617069732e636f" .
            "6d2f4c6f6753696e6b122d0a0473696e6b18022001280b321a2e676f6f67" .
            "6c652e6c6f6767696e672e76322e4c6f6753696e6b4203e0410212230a16" .
            "756e697175655f7772697465725f6964656e746974791803200128084203" .
            "e0410122d8010a1155706461746553696e6b5265717565737412390a0973" .
            "696e6b5f6e616d651801200128094226e04102fa41200a1e6c6f6767696e" .
            "672e676f6f676c65617069732e636f6d2f4c6f6753696e6b122d0a047369" .
            "6e6b18022001280b321a2e676f6f676c652e6c6f6767696e672e76322e4c" .
            "6f6753696e6b4203e0410212230a16756e697175655f7772697465725f69" .
            "64656e746974791803200128084203e0410112340a0b7570646174655f6d" .
            "61736b18042001280b321a2e676f6f676c652e70726f746f6275662e4669" .
            "656c644d61736b4203e04101224e0a1144656c65746553696e6b52657175" .
            "65737412390a0973696e6b5f6e616d651801200128094226e04102fa4120" .
            "0a1e6c6f6767696e672e676f6f676c65617069732e636f6d2f4c6f675369" .
            "6e6b22c2030a0c4c6f674578636c7573696f6e12110a046e616d65180120" .
            "0128094203e0410212180a0b6465736372697074696f6e18022001280942" .
            "03e0410112130a0666696c7465721803200128094203e0410212150a0864" .
            "697361626c65641804200128084203e0410112340a0b6372656174655f74" .
            "696d6518052001280b321a2e676f6f676c652e70726f746f6275662e5469" .
            "6d657374616d704203e0410312340a0b7570646174655f74696d65180620" .
            "01280b321a2e676f6f676c652e70726f746f6275662e54696d657374616d" .
            "704203e041033aec01ea41e8010a236c6f6767696e672e676f6f676c6561" .
            "7069732e636f6d2f4c6f674578636c7573696f6e122970726f6a65637473" .
            "2f7b70726f6a6563747d2f6578636c7573696f6e732f7b6578636c757369" .
            "6f6e7d12336f7267616e697a6174696f6e732f7b6f7267616e697a617469" .
            "6f6e7d2f6578636c7573696f6e732f7b6578636c7573696f6e7d1227666f" .
            "6c646572732f7b666f6c6465727d2f6578636c7573696f6e732f7b657863" .
            "6c7573696f6e7d123862696c6c696e674163636f756e74732f7b62696c6c" .
            "696e675f6163636f756e747d2f6578636c7573696f6e732f7b6578636c75" .
            "73696f6e7d2285010a154c6973744578636c7573696f6e73526571756573" .
            "74123b0a06706172656e74180120012809422be04102fa412512236c6f67" .
            "67696e672e676f6f676c65617069732e636f6d2f4c6f674578636c757369" .
            "6f6e12170a0a706167655f746f6b656e1802200128094203e0410112160a" .
            "09706167655f73697a651803200128054203e0410122660a164c69737445" .
            "78636c7573696f6e73526573706f6e736512330a0a6578636c7573696f6e" .
            "7318012003280b321f2e676f6f676c652e6c6f6767696e672e76322e4c6f" .
            "674578636c7573696f6e12170a0f6e6578745f706167655f746f6b656e18" .
            "022001280922500a134765744578636c7573696f6e526571756573741239" .
            "0a046e616d65180120012809422be04102fa41250a236c6f6767696e672e" .
            "676f6f676c65617069732e636f6d2f4c6f674578636c7573696f6e228e01" .
            "0a164372656174654578636c7573696f6e52657175657374123b0a067061" .
            "72656e74180120012809422be04102fa412512236c6f6767696e672e676f" .
            "6f676c65617069732e636f6d2f4c6f674578636c7573696f6e12370a0965" .
            "78636c7573696f6e18022001280b321f2e676f6f676c652e6c6f6767696e" .
            "672e76322e4c6f674578636c7573696f6e4203e0410222c2010a16557064" .
            "6174654578636c7573696f6e5265717565737412390a046e616d65180120" .
            "012809422be04102fa41250a236c6f6767696e672e676f6f676c65617069" .
            "732e636f6d2f4c6f674578636c7573696f6e12370a096578636c7573696f" .
            "6e18022001280b321f2e676f6f676c652e6c6f6767696e672e76322e4c6f" .
            "674578636c7573696f6e4203e0410212340a0b7570646174655f6d61736b" .
            "18032001280b321a2e676f6f676c652e70726f746f6275662e4669656c64" .
            "4d61736b4203e0410222530a1644656c6574654578636c7573696f6e5265" .
            "717565737412390a046e616d65180120012809422be04102fa41250a236c" .
            "6f6767696e672e676f6f676c65617069732e636f6d2f4c6f674578636c75" .
            "73696f6e22530a16476574436d656b53657474696e677352657175657374" .
            "12390a046e616d65180120012809422be04102fa41250a236c6f6767696e" .
            "672e676f6f676c65617069732e636f6d2f436d656b53657474696e677322" .
            "a1010a19557064617465436d656b53657474696e67735265717565737412" .
            "110a046e616d651801200128094203e04102123b0a0d636d656b5f736574" .
            "74696e677318022001280b321f2e676f6f676c652e6c6f6767696e672e76" .
            "322e436d656b53657474696e67734203e0410212340a0b7570646174655f" .
            "6d61736b18032001280b321a2e676f6f676c652e70726f746f6275662e46" .
            "69656c644d61736b4203e04101229f020a0c436d656b53657474696e6773" .
            "12110a046e616d651801200128094203e0410312140a0c6b6d735f6b6579" .
            "5f6e616d65180220012809121f0a12736572766963655f6163636f756e74" .
            "5f69641803200128094203e041033ac401ea41c0010a236c6f6767696e67" .
            "2e676f6f676c65617069732e636f6d2f436d656b53657474696e6773121f" .
            "70726f6a656374732f7b70726f6a6563747d2f636d656b53657474696e67" .
            "7312296f7267616e697a6174696f6e732f7b6f7267616e697a6174696f6e" .
            "7d2f636d656b53657474696e6773121d666f6c646572732f7b666f6c6465" .
            "727d2f636d656b53657474696e6773122e62696c6c696e674163636f756e" .
            "74732f7b62696c6c696e675f6163636f756e747d2f636d656b5365747469" .
            "6e67732a530a0e4c6966656379636c655374617465121f0a1b4c49464543" .
            "59434c455f53544154455f554e5350454349464945441000120a0a064143" .
            "54495645100112140a1044454c4554455f524551554553544544100232af" .
            "270a0f436f6e66696753657276696365563212dc020a0b4c697374427563" .
            "6b65747312252e676f6f676c652e6c6f6767696e672e76322e4c69737442" .
            "75636b657473526571756573741a262e676f6f676c652e6c6f6767696e67" .
            "2e76322e4c6973744275636b657473526573706f6e736522fd0182d3e493" .
            "02ed0112242f76322f7b706172656e743d2a2f2a2f6c6f636174696f6e73" .
            "2f2a7d2f6275636b6574735a2d122b2f76322f7b706172656e743d70726f" .
            "6a656374732f2a2f6c6f636174696f6e732f2a7d2f6275636b6574735a32" .
            "12302f76322f7b706172656e743d6f7267616e697a6174696f6e732f2a2f" .
            "6c6f636174696f6e732f2a7d2f6275636b6574735a2c122a2f76322f7b70" .
            "6172656e743d666f6c646572732f2a2f6c6f636174696f6e732f2a7d2f62" .
            "75636b6574735a3412322f76322f7b706172656e743d62696c6c696e6741" .
            "63636f756e74732f2a2f6c6f636174696f6e732f2a7d2f6275636b657473" .
            "da4106706172656e7412b9020a094765744275636b657412232e676f6f67" .
            "6c652e6c6f6767696e672e76322e4765744275636b657452657175657374" .
            "1a1c2e676f6f676c652e6c6f6767696e672e76322e4c6f674275636b6574" .
            "22e80182d3e49302e10112242f76322f7b6e616d653d2a2f2a2f6c6f6361" .
            "74696f6e732f2a2f6275636b6574732f2a7d5a2d122b2f76322f7b6e616d" .
            "653d70726f6a656374732f2a2f6c6f636174696f6e732f2a2f6275636b65" .
            "74732f2a7d5a3212302f76322f7b6e616d653d6f7267616e697a6174696f" .
            "6e732f2a2f6c6f636174696f6e732f2a2f6275636b6574732f2a7d5a2c12" .
            "2a2f76322f7b6e616d653d666f6c646572732f2a2f6c6f636174696f6e73" .
            "2f2a2f6275636b6574732f2a7d5a2812262f76322f7b6e616d653d62696c" .
            "6c696e674163636f756e74732f2a2f6275636b6574732f2a7d12f3020a0c" .
            "5570646174654275636b657412262e676f6f676c652e6c6f6767696e672e" .
            "76322e5570646174654275636b6574526571756573741a1c2e676f6f676c" .
            "652e6c6f6767696e672e76322e4c6f674275636b6574229c0282d3e49302" .
            "950232242f76322f7b6e616d653d2a2f2a2f6c6f636174696f6e732f2a2f" .
            "6275636b6574732f2a7d3a066275636b65745a35322b2f76322f7b6e616d" .
            "653d70726f6a656374732f2a2f6c6f636174696f6e732f2a2f6275636b65" .
            "74732f2a7d3a066275636b65745a3a32302f76322f7b6e616d653d6f7267" .
            "616e697a6174696f6e732f2a2f6c6f636174696f6e732f2a2f6275636b65" .
            "74732f2a7d3a066275636b65745a34322a2f76322f7b6e616d653d666f6c" .
            "646572732f2a2f6c6f636174696f6e732f2a2f6275636b6574732f2a7d3a" .
            "066275636b65745a3c32322f76322f7b6e616d653d62696c6c696e674163" .
            "636f756e74732f2a2f6c6f636174696f6e732f2a2f6275636b6574732f2a" .
            "7d3a066275636b65741290020a094c69737453696e6b7312232e676f6f67" .
            "6c652e6c6f6767696e672e76322e4c69737453696e6b7352657175657374" .
            "1a242e676f6f676c652e6c6f6767696e672e76322e4c69737453696e6b73" .
            "526573706f6e736522b70182d3e49302a70112162f76322f7b706172656e" .
            "743d2a2f2a7d2f73696e6b735a1f121d2f76322f7b706172656e743d7072" .
            "6f6a656374732f2a7d2f73696e6b735a2412222f76322f7b706172656e74" .
            "3d6f7267616e697a6174696f6e732f2a7d2f73696e6b735a1e121c2f7632" .
            "2f7b706172656e743d666f6c646572732f2a7d2f73696e6b735a2612242f" .
            "76322f7b706172656e743d62696c6c696e674163636f756e74732f2a7d2f" .
            "73696e6b73da4106706172656e74129e020a0747657453696e6b12212e67" .
            "6f6f676c652e6c6f6767696e672e76322e47657453696e6b526571756573" .
            "741a1a2e676f6f676c652e6c6f6767696e672e76322e4c6f6753696e6b22" .
            "d30182d3e49302c001121b2f76322f7b73696e6b5f6e616d653d2a2f2a2f" .
            "73696e6b732f2a7d5a2412222f76322f7b73696e6b5f6e616d653d70726f" .
            "6a656374732f2a2f73696e6b732f2a7d5a2912272f76322f7b73696e6b5f" .
            "6e616d653d6f7267616e697a6174696f6e732f2a2f73696e6b732f2a7d5a" .
            "2312212f76322f7b73696e6b5f6e616d653d666f6c646572732f2a2f7369" .
            "6e6b732f2a7d5a2b12292f76322f7b73696e6b5f6e616d653d62696c6c69" .
            "6e674163636f756e74732f2a2f73696e6b732f2a7dda410973696e6b5f6e" .
            "616d6512ab020a0a43726561746553696e6b12242e676f6f676c652e6c6f" .
            "6767696e672e76322e43726561746553696e6b526571756573741a1a2e67" .
            "6f6f676c652e6c6f6767696e672e76322e4c6f6753696e6b22da0182d3e4" .
            "9302c50122162f76322f7b706172656e743d2a2f2a7d2f73696e6b733a04" .
            "73696e6b5a25221d2f76322f7b706172656e743d70726f6a656374732f2a" .
            "7d2f73696e6b733a0473696e6b5a2a22222f76322f7b706172656e743d6f" .
            "7267616e697a6174696f6e732f2a7d2f73696e6b733a0473696e6b5a2422" .
            "1c2f76322f7b706172656e743d666f6c646572732f2a7d2f73696e6b733a" .
            "0473696e6b5a2c22242f76322f7b706172656e743d62696c6c696e674163" .
            "636f756e74732f2a7d2f73696e6b733a0473696e6bda410b706172656e74" .
            "2c73696e6b129f040a0a55706461746553696e6b12242e676f6f676c652e" .
            "6c6f6767696e672e76322e55706461746553696e6b526571756573741a1a" .
            "2e676f6f676c652e6c6f6767696e672e76322e4c6f6753696e6b22ce0382" .
            "d3e4930299031a1b2f76322f7b73696e6b5f6e616d653d2a2f2a2f73696e" .
            "6b732f2a7d3a0473696e6b5a2a1a222f76322f7b73696e6b5f6e616d653d" .
            "70726f6a656374732f2a2f73696e6b732f2a7d3a0473696e6b5a2f1a272f" .
            "76322f7b73696e6b5f6e616d653d6f7267616e697a6174696f6e732f2a2f" .
            "73696e6b732f2a7d3a0473696e6b5a291a212f76322f7b73696e6b5f6e61" .
            "6d653d666f6c646572732f2a2f73696e6b732f2a7d3a0473696e6b5a311a" .
            "292f76322f7b73696e6b5f6e616d653d62696c6c696e674163636f756e74" .
            "732f2a2f73696e6b732f2a7d3a0473696e6b5a2a32222f76322f7b73696e" .
            "6b5f6e616d653d70726f6a656374732f2a2f73696e6b732f2a7d3a047369" .
            "6e6b5a2f32272f76322f7b73696e6b5f6e616d653d6f7267616e697a6174" .
            "696f6e732f2a2f73696e6b732f2a7d3a0473696e6b5a2932212f76322f7b" .
            "73696e6b5f6e616d653d666f6c646572732f2a2f73696e6b732f2a7d3a04" .
            "73696e6b5a3132292f76322f7b73696e6b5f6e616d653d62696c6c696e67" .
            "4163636f756e74732f2a2f73696e6b732f2a7d3a0473696e6bda411a7369" .
            "6e6b5f6e616d652c73696e6b2c7570646174655f6d61736bda410e73696e" .
            "6b5f6e616d652c73696e6b12a0020a0a44656c65746553696e6b12242e67" .
            "6f6f676c652e6c6f6767696e672e76322e44656c65746553696e6b526571" .
            "756573741a162e676f6f676c652e70726f746f6275662e456d70747922d3" .
            "0182d3e49302c0012a1b2f76322f7b73696e6b5f6e616d653d2a2f2a2f73" .
            "696e6b732f2a7d5a242a222f76322f7b73696e6b5f6e616d653d70726f6a" .
            "656374732f2a2f73696e6b732f2a7d5a292a272f76322f7b73696e6b5f6e" .
            "616d653d6f7267616e697a6174696f6e732f2a2f73696e6b732f2a7d5a23" .
            "2a212f76322f7b73696e6b5f6e616d653d666f6c646572732f2a2f73696e" .
            "6b732f2a7d5a2b2a292f76322f7b73696e6b5f6e616d653d62696c6c696e" .
            "674163636f756e74732f2a2f73696e6b732f2a7dda410973696e6b5f6e61" .
            "6d6512b8020a0e4c6973744578636c7573696f6e7312282e676f6f676c65" .
            "2e6c6f6767696e672e76322e4c6973744578636c7573696f6e7352657175" .
            "6573741a292e676f6f676c652e6c6f6767696e672e76322e4c6973744578" .
            "636c7573696f6e73526573706f6e736522d00182d3e49302c001121b2f76" .
            "322f7b706172656e743d2a2f2a7d2f6578636c7573696f6e735a2412222f" .
            "76322f7b706172656e743d70726f6a656374732f2a7d2f6578636c757369" .
            "6f6e735a2912272f76322f7b706172656e743d6f7267616e697a6174696f" .
            "6e732f2a7d2f6578636c7573696f6e735a2312212f76322f7b706172656e" .
            "743d666f6c646572732f2a7d2f6578636c7573696f6e735a2b12292f7632" .
            "2f7b706172656e743d62696c6c696e674163636f756e74732f2a7d2f6578" .
            "636c7573696f6e73da4106706172656e7412a8020a0c4765744578636c75" .
            "73696f6e12262e676f6f676c652e6c6f6767696e672e76322e4765744578" .
            "636c7573696f6e526571756573741a1f2e676f6f676c652e6c6f6767696e" .
            "672e76322e4c6f674578636c7573696f6e22ce0182d3e49302c001121b2f" .
            "76322f7b6e616d653d2a2f2a2f6578636c7573696f6e732f2a7d5a241222" .
            "2f76322f7b6e616d653d70726f6a656374732f2a2f6578636c7573696f6e" .
            "732f2a7d5a2912272f76322f7b6e616d653d6f7267616e697a6174696f6e" .
            "732f2a2f6578636c7573696f6e732f2a7d5a2312212f76322f7b6e616d65" .
            "3d666f6c646572732f2a2f6578636c7573696f6e732f2a7d5a2b12292f76" .
            "322f7b6e616d653d62696c6c696e674163636f756e74732f2a2f6578636c" .
            "7573696f6e732f2a7dda41046e616d6512f1020a0f437265617465457863" .
            "6c7573696f6e12292e676f6f676c652e6c6f6767696e672e76322e437265" .
            "6174654578636c7573696f6e526571756573741a1f2e676f6f676c652e6c" .
            "6f6767696e672e76322e4c6f674578636c7573696f6e22910282d3e49302" .
            "f701221b2f76322f7b706172656e743d2a2f2a7d2f6578636c7573696f6e" .
            "733a096578636c7573696f6e5a2f22222f76322f7b706172656e743d7072" .
            "6f6a656374732f2a7d2f6578636c7573696f6e733a096578636c7573696f" .
            "6e5a3422272f76322f7b706172656e743d6f7267616e697a6174696f6e73" .
            "2f2a7d2f6578636c7573696f6e733a096578636c7573696f6e5a2e22212f" .
            "76322f7b706172656e743d666f6c646572732f2a7d2f6578636c7573696f" .
            "6e733a096578636c7573696f6e5a3622292f76322f7b706172656e743d62" .
            "696c6c696e674163636f756e74732f2a7d2f6578636c7573696f6e733a09" .
            "6578636c7573696f6eda4110706172656e742c6578636c7573696f6e12fb" .
            "020a0f5570646174654578636c7573696f6e12292e676f6f676c652e6c6f" .
            "6767696e672e76322e5570646174654578636c7573696f6e526571756573" .
            "741a1f2e676f6f676c652e6c6f6767696e672e76322e4c6f674578636c75" .
            "73696f6e229b0282d3e49302f701321b2f76322f7b6e616d653d2a2f2a2f" .
            "6578636c7573696f6e732f2a7d3a096578636c7573696f6e5a2f32222f76" .
            "322f7b6e616d653d70726f6a656374732f2a2f6578636c7573696f6e732f" .
            "2a7d3a096578636c7573696f6e5a3432272f76322f7b6e616d653d6f7267" .
            "616e697a6174696f6e732f2a2f6578636c7573696f6e732f2a7d3a096578" .
            "636c7573696f6e5a2e32212f76322f7b6e616d653d666f6c646572732f2a" .
            "2f6578636c7573696f6e732f2a7d3a096578636c7573696f6e5a3632292f" .
            "76322f7b6e616d653d62696c6c696e674163636f756e74732f2a2f657863" .
            "6c7573696f6e732f2a7d3a096578636c7573696f6eda411a6e616d652c65" .
            "78636c7573696f6e2c7570646174655f6d61736b12a5020a0f44656c6574" .
            "654578636c7573696f6e12292e676f6f676c652e6c6f6767696e672e7632" .
            "2e44656c6574654578636c7573696f6e526571756573741a162e676f6f67" .
            "6c652e70726f746f6275662e456d70747922ce0182d3e49302c0012a1b2f" .
            "76322f7b6e616d653d2a2f2a2f6578636c7573696f6e732f2a7d5a242a22" .
            "2f76322f7b6e616d653d70726f6a656374732f2a2f6578636c7573696f6e" .
            "732f2a7d5a292a272f76322f7b6e616d653d6f7267616e697a6174696f6e" .
            "732f2a2f6578636c7573696f6e732f2a7d5a232a212f76322f7b6e616d65" .
            "3d666f6c646572732f2a2f6578636c7573696f6e732f2a7d5a2b2a292f76" .
            "322f7b6e616d653d62696c6c696e674163636f756e74732f2a2f6578636c" .
            "7573696f6e732f2a7dda41046e616d6512ad010a0f476574436d656b5365" .
            "7474696e677312292e676f6f676c652e6c6f6767696e672e76322e476574" .
            "436d656b53657474696e6773526571756573741a1f2e676f6f676c652e6c" .
            "6f6767696e672e76322e436d656b53657474696e6773224e82d3e4930248" .
            "121b2f76322f7b6e616d653d2a2f2a7d2f636d656b53657474696e67735a" .
            "2912272f76322f7b6e616d653d6f7267616e697a6174696f6e732f2a7d2f" .
            "636d656b53657474696e677312d1010a12557064617465436d656b536574" .
            "74696e6773122c2e676f6f676c652e6c6f6767696e672e76322e55706461" .
            "7465436d656b53657474696e6773526571756573741a1f2e676f6f676c65" .
            "2e6c6f6767696e672e76322e436d656b53657474696e6773226c82d3e493" .
            "0266321b2f76322f7b6e616d653d2a2f2a7d2f636d656b53657474696e67" .
            "733a0d636d656b5f73657474696e67735a3832272f76322f7b6e616d653d" .
            "6f7267616e697a6174696f6e732f2a7d2f636d656b53657474696e67733a" .
            "0d636d656b5f73657474696e67731adf01ca41166c6f6767696e672e676f" .
            "6f676c65617069732e636f6dd241c20168747470733a2f2f7777772e676f" .
            "6f676c65617069732e636f6d2f617574682f636c6f75642d706c6174666f" .
            "726d2c68747470733a2f2f7777772e676f6f676c65617069732e636f6d2f" .
            "617574682f636c6f75642d706c6174666f726d2e726561642d6f6e6c792c" .
            "68747470733a2f2f7777772e676f6f676c65617069732e636f6d2f617574" .
            "682f6c6f6767696e672e61646d696e2c68747470733a2f2f7777772e676f" .
            "6f676c65617069732e636f6d2f617574682f6c6f6767696e672e72656164" .
            "42bc030a15636f6d2e676f6f676c652e6c6f6767696e672e763242124c6f" .
            "6767696e67436f6e66696750726f746f50015a38676f6f676c652e676f6c" .
            "616e672e6f72672f67656e70726f746f2f676f6f676c65617069732f6c6f" .
            "6767696e672f76323b6c6f6767696e67f80101aa0217476f6f676c652e43" .
            "6c6f75642e4c6f6767696e672e5632ca0217476f6f676c655c436c6f7564" .
            "5c4c6f6767696e675c5632ea41600a2b6c6f6767696e672e676f6f676c65" .
            "617069732e636f6d2f4f7267616e697a6174696f6e4c6f636174696f6e12" .
            "316f7267616e697a6174696f6e732f7b6f7267616e697a6174696f6e7d2f" .
            "6c6f636174696f6e732f7b6c6f636174696f6e7dea414e0a256c6f676769" .
            "6e672e676f6f676c65617069732e636f6d2f466f6c6465724c6f63617469" .
            "6f6e1225666f6c646572732f7b666f6c6465727d2f6c6f636174696f6e73" .
            "2f7b6c6f636174696f6e7dea41670a2d6c6f6767696e672e676f6f676c65" .
            "617069732e636f6d2f42696c6c696e674163636f756e744c6f636174696f" .
            "6e123662696c6c696e674163636f756e74732f7b62696c6c696e675f6163" .
            "636f756e747d2f6c6f636174696f6e732f7b6c6f636174696f6e7d620670" .
            "726f746f33"
        ), true);

        static::$is_initialized = true;
    }
}

