<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

namespace GPBMetadata\Google\Cloud\Bigquery\Datatransfer\V1;

class Datatransfer
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Api\Annotations::initOnce();
        \GPBMetadata\Google\Api\Client::initOnce();
        \GPBMetadata\Google\Api\FieldBehavior::initOnce();
        \GPBMetadata\Google\Api\Resource::initOnce();
        \GPBMetadata\Google\Cloud\Bigquery\Datatransfer\V1\Transfer::initOnce();
        \GPBMetadata\Google\Protobuf\Duration::initOnce();
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        \GPBMetadata\Google\Protobuf\FieldMask::initOnce();
        \GPBMetadata\Google\Protobuf\Timestamp::initOnce();
        \GPBMetadata\Google\Protobuf\Wrappers::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0aa24d0a38676f6f676c652f636c6f75642f62696771756572792f646174" .
            "617472616e736665722f76312f646174617472616e736665722e70726f74" .
            "6f1225676f6f676c652e636c6f75642e62696771756572792e6461746174" .
            "72616e736665722e76311a17676f6f676c652f6170692f636c69656e742e" .
            "70726f746f1a1f676f6f676c652f6170692f6669656c645f626568617669" .
            "6f722e70726f746f1a19676f6f676c652f6170692f7265736f757263652e" .
            "70726f746f1a34676f6f676c652f636c6f75642f62696771756572792f64" .
            "6174617472616e736665722f76312f7472616e736665722e70726f746f1a" .
            "1e676f6f676c652f70726f746f6275662f6475726174696f6e2e70726f74" .
            "6f1a1b676f6f676c652f70726f746f6275662f656d7074792e70726f746f" .
            "1a20676f6f676c652f70726f746f6275662f6669656c645f6d61736b2e70" .
            "726f746f1a1f676f6f676c652f70726f746f6275662f74696d657374616d" .
            "702e70726f746f1a1e676f6f676c652f70726f746f6275662f7772617070" .
            "6572732e70726f746f2285050a1344617461536f75726365506172616d65" .
            "74657212100a08706172616d5f696418012001280912140a0c646973706c" .
            "61795f6e616d6518022001280912130a0b6465736372697074696f6e1803" .
            "20012809124d0a047479706518042001280e323f2e676f6f676c652e636c" .
            "6f75642e62696771756572792e646174617472616e736665722e76312e44" .
            "617461536f75726365506172616d657465722e5479706512100a08726571" .
            "756972656418052001280812100a08726570656174656418062001280812" .
            "180a1076616c69646174696f6e5f726567657818072001280912160a0e61" .
            "6c6c6f7765645f76616c756573180820032809122f0a096d696e5f76616c" .
            "756518092001280b321c2e676f6f676c652e70726f746f6275662e446f75" .
            "626c6556616c7565122f0a096d61785f76616c7565180a2001280b321c2e" .
            "676f6f676c652e70726f746f6275662e446f75626c6556616c7565124a0a" .
            "066669656c6473180b2003280b323a2e676f6f676c652e636c6f75642e62" .
            "696771756572792e646174617472616e736665722e76312e44617461536f" .
            "75726365506172616d65746572121e0a1676616c69646174696f6e5f6465" .
            "736372697074696f6e180c20012809121b0a1376616c69646174696f6e5f" .
            "68656c705f75726c180d2001280912110a09696d6d757461626c65180e20" .
            "012808120f0a0772656375727365180f2001280812120a0a646570726563" .
            "6174656418142001280822690a045479706512140a10545950455f554e53" .
            "50454349464945441000120a0a06535452494e471001120b0a07494e5445" .
            "4745521002120a0a06444f55424c451003120b0a07424f4f4c45414e1004" .
            "120a0a065245434f52441005120d0a09504c55535f504147451006228409" .
            "0a0a44617461536f7572636512110a046e616d651801200128094203e041" .
            "0312160a0e646174615f736f757263655f696418022001280912140a0c64" .
            "6973706c61795f6e616d6518032001280912130a0b646573637269707469" .
            "6f6e18042001280912110a09636c69656e745f6964180520012809120e0a" .
            "0673636f706573180620032809124e0a0d7472616e736665725f74797065" .
            "18072001280e32332e676f6f676c652e636c6f75642e6269677175657279" .
            "2e646174617472616e736665722e76312e5472616e736665725479706542" .
            "02180112270a1b737570706f7274735f6d756c7469706c655f7472616e73" .
            "6665727318082001280842021801121f0a177570646174655f646561646c" .
            "696e655f7365636f6e647318092001280512180a1064656661756c745f73" .
            "63686564756c65180a2001280912200a18737570706f7274735f63757374" .
            "6f6d5f7363686564756c65180b20012808124e0a0a706172616d65746572" .
            "73180c2003280b323a2e676f6f676c652e636c6f75642e62696771756572" .
            "792e646174617472616e736665722e76312e44617461536f757263655061" .
            "72616d6574657212100a0868656c705f75726c180d20012809125f0a1261" .
            "7574686f72697a6174696f6e5f74797065180e2001280e32432e676f6f67" .
            "6c652e636c6f75642e62696771756572792e646174617472616e73666572" .
            "2e76312e44617461536f757263652e417574686f72697a6174696f6e5479" .
            "7065125c0a11646174615f726566726573685f74797065180f2001280e32" .
            "412e676f6f676c652e636c6f75642e62696771756572792e646174617472" .
            "616e736665722e76312e44617461536f757263652e446174615265667265" .
            "73685479706512280a2064656661756c745f646174615f72656672657368" .
            "5f77696e646f775f64617973181020012805121c0a146d616e75616c5f72" .
            "756e735f64697361626c6564181120012808123c0a196d696e696d756d5f" .
            "7363686564756c655f696e74657276616c18122001280b32192e676f6f67" .
            "6c652e70726f746f6275662e4475726174696f6e22730a11417574686f72" .
            "697a6174696f6e5479706512220a1e415554484f52495a4154494f4e5f54" .
            "5950455f554e535045434946494544100012160a12415554484f52495a41" .
            "54494f4e5f434f4445100112220a1e474f4f474c455f504c55535f415554" .
            "484f52495a4154494f4e5f434f4445100222630a0f446174615265667265" .
            "73685479706512210a1d444154415f524546524553485f545950455f554e" .
            "535045434946494544100012120a0e534c4944494e475f57494e444f5710" .
            "0112190a15435553544f4d5f534c4944494e475f57494e444f5710023aa5" .
            "01ea41a1010a2e6269677175657279646174617472616e736665722e676f" .
            "6f676c65617069732e636f6d2f44617461536f75726365122c70726f6a65" .
            "6374732f7b70726f6a6563747d2f64617461536f75726365732f7b646174" .
            "615f736f757263657d124170726f6a656374732f7b70726f6a6563747d2f" .
            "6c6f636174696f6e732f7b6c6f636174696f6e7d2f64617461536f757263" .
            "65732f7b646174615f736f757263657d225c0a1447657444617461536f75" .
            "7263655265717565737412440a046e616d651801200128094236e04102fa" .
            "41300a2e6269677175657279646174617472616e736665722e676f6f676c" .
            "65617069732e636f6d2f44617461536f757263652287010a164c69737444" .
            "617461536f75726365735265717565737412460a06706172656e74180120" .
            "0128094236e04102fa4130122e6269677175657279646174617472616e73" .
            "6665722e676f6f676c65617069732e636f6d2f44617461536f7572636512" .
            "120a0a706167655f746f6b656e18032001280912110a09706167655f7369" .
            "7a651804200128052280010a174c69737444617461536f75726365735265" .
            "73706f6e736512470a0c646174615f736f757263657318012003280b3231" .
            "2e676f6f676c652e636c6f75642e62696771756572792e64617461747261" .
            "6e736665722e76312e44617461536f75726365121c0a0f6e6578745f7061" .
            "67655f746f6b656e1802200128094203e04103228e020a1b437265617465" .
            "5472616e73666572436f6e66696752657175657374124a0a06706172656e" .
            "74180120012809423ae04102fa4134123262696771756572796461746174" .
            "72616e736665722e676f6f676c65617069732e636f6d2f5472616e736665" .
            "72436f6e66696712530a0f7472616e736665725f636f6e66696718022001" .
            "280b32352e676f6f676c652e636c6f75642e62696771756572792e646174" .
            "617472616e736665722e76312e5472616e73666572436f6e6669674203e0" .
            "4102121a0a12617574686f72697a6174696f6e5f636f6465180320012809" .
            "12140a0c76657273696f6e5f696e666f180520012809121c0a1473657276" .
            "6963655f6163636f756e745f6e616d6518062001280922f8010a1b557064" .
            "6174655472616e73666572436f6e6669675265717565737412530a0f7472" .
            "616e736665725f636f6e66696718012001280b32352e676f6f676c652e63" .
            "6c6f75642e62696771756572792e646174617472616e736665722e76312e" .
            "5472616e73666572436f6e6669674203e04102121a0a12617574686f7269" .
            "7a6174696f6e5f636f646518032001280912340a0b7570646174655f6d61" .
            "736b18042001280b321a2e676f6f676c652e70726f746f6275662e466965" .
            "6c644d61736b4203e0410212140a0c76657273696f6e5f696e666f180520" .
            "012809121c0a14736572766963655f6163636f756e745f6e616d65180620" .
            "01280922640a184765745472616e73666572436f6e666967526571756573" .
            "7412480a046e616d65180120012809423ae04102fa41340a326269677175" .
            "657279646174617472616e736665722e676f6f676c65617069732e636f6d" .
            "2f5472616e73666572436f6e66696722670a1b44656c6574655472616e73" .
            "666572436f6e6669675265717565737412480a046e616d65180120012809" .
            "423ae04102fa41340a326269677175657279646174617472616e73666572" .
            "2e676f6f676c65617069732e636f6d2f5472616e73666572436f6e666967" .
            "22560a154765745472616e7366657252756e52657175657374123d0a046e" .
            "616d65180120012809422fe04102fa41290a276269677175657279646174" .
            "617472616e736665722e676f6f676c65617069732e636f6d2f52756e2259" .
            "0a1844656c6574655472616e7366657252756e52657175657374123d0a04" .
            "6e616d65180120012809422fe04102fa41290a2762696771756572796461" .
            "74617472616e736665722e676f6f676c65617069732e636f6d2f52756e22" .
            "a8010a1a4c6973745472616e73666572436f6e6669677352657175657374" .
            "124a0a06706172656e74180120012809423ae04102fa4134123262696771" .
            "75657279646174617472616e736665722e676f6f676c65617069732e636f" .
            "6d2f5472616e73666572436f6e66696712170a0f646174615f736f757263" .
            "655f69647318022003280912120a0a706167655f746f6b656e1803200128" .
            "0912110a09706167655f73697a651804200128052291010a1b4c69737454" .
            "72616e73666572436f6e66696773526573706f6e736512540a107472616e" .
            "736665725f636f6e6669677318012003280b32352e676f6f676c652e636c" .
            "6f75642e62696771756572792e646174617472616e736665722e76312e54" .
            "72616e73666572436f6e6669674203e04103121c0a0f6e6578745f706167" .
            "655f746f6b656e1802200128094203e0410322de020a174c697374547261" .
            "6e7366657252756e7352657175657374123f0a06706172656e7418012001" .
            "2809422fe04102fa412912276269677175657279646174617472616e7366" .
            "65722e676f6f676c65617069732e636f6d2f52756e12440a067374617465" .
            "7318022003280e32342e676f6f676c652e636c6f75642e62696771756572" .
            "792e646174617472616e736665722e76312e5472616e7366657253746174" .
            "6512120a0a706167655f746f6b656e18032001280912110a09706167655f" .
            "73697a65180420012805125e0a0b72756e5f617474656d70741805200128" .
            "0e32492e676f6f676c652e636c6f75642e62696771756572792e64617461" .
            "7472616e736665722e76312e4c6973745472616e7366657252756e735265" .
            "71756573742e52756e417474656d707422350a0a52756e417474656d7074" .
            "121b0a1752554e5f415454454d50545f554e535045434946494544100012" .
            "0a0a064c415445535410012288010a184c6973745472616e736665725275" .
            "6e73526573706f6e7365124e0a0d7472616e736665725f72756e73180120" .
            "03280b32322e676f6f676c652e636c6f75642e62696771756572792e6461" .
            "74617472616e736665722e76312e5472616e7366657252756e4203e04103" .
            "121c0a0f6e6578745f706167655f746f6b656e1802200128094203e04103" .
            "22e0010a174c6973745472616e736665724c6f677352657175657374123f" .
            "0a06706172656e74180120012809422fe04102fa41290a27626967717565" .
            "7279646174617472616e736665722e676f6f676c65617069732e636f6d2f" .
            "52756e12120a0a706167655f746f6b656e18042001280912110a09706167" .
            "655f73697a65180520012805125d0a0d6d6573736167655f747970657318" .
            "062003280e32462e676f6f676c652e636c6f75642e62696771756572792e" .
            "646174617472616e736665722e76312e5472616e736665724d6573736167" .
            "652e4d65737361676553657665726974792290010a184c6973745472616e" .
            "736665724c6f6773526573706f6e736512560a117472616e736665725f6d" .
            "6573736167657318012003280b32362e676f6f676c652e636c6f75642e62" .
            "696771756572792e646174617472616e736665722e76312e5472616e7366" .
            "65724d6573736167654203e04103121c0a0f6e6578745f706167655f746f" .
            "6b656e1802200128094203e04103225e0a16436865636b56616c69644372" .
            "6564735265717565737412440a046e616d651801200128094236e04102fa" .
            "41300a2e6269677175657279646174617472616e736665722e676f6f676c" .
            "65617069732e636f6d2f44617461536f7572636522320a17436865636b56" .
            "616c69644372656473526573706f6e736512170a0f6861735f76616c6964" .
            "5f637265647318012001280822d1010a1b5363686564756c655472616e73" .
            "66657252756e7352657175657374124a0a06706172656e74180120012809" .
            "423ae04102fa41340a326269677175657279646174617472616e73666572" .
            "2e676f6f676c65617069732e636f6d2f5472616e73666572436f6e666967" .
            "12330a0a73746172745f74696d6518022001280b321a2e676f6f676c652e" .
            "70726f746f6275662e54696d657374616d704203e0410212310a08656e64" .
            "5f74696d6518032001280b321a2e676f6f676c652e70726f746f6275662e" .
            "54696d657374616d704203e0410222600a1c5363686564756c655472616e" .
            "7366657252756e73526573706f6e736512400a0472756e7318012003280b" .
            "32322e676f6f676c652e636c6f75642e62696771756572792e6461746174" .
            "72616e736665722e76312e5472616e7366657252756e2287030a1e537461" .
            "72744d616e75616c5472616e7366657252756e735265717565737412470a" .
            "06706172656e741801200128094237fa41340a3262696771756572796461" .
            "74617472616e736665722e676f6f676c65617069732e636f6d2f5472616e" .
            "73666572436f6e666967126f0a147265717565737465645f74696d655f72" .
            "616e676518032001280b324f2e676f6f676c652e636c6f75642e62696771" .
            "756572792e646174617472616e736665722e76312e53746172744d616e75" .
            "616c5472616e7366657252756e73526571756573742e54696d6552616e67" .
            "65480012380a127265717565737465645f72756e5f74696d651804200128" .
            "0b321a2e676f6f676c652e70726f746f6275662e54696d657374616d7048" .
            "001a690a0954696d6552616e6765122e0a0a73746172745f74696d651801" .
            "2001280b321a2e676f6f676c652e70726f746f6275662e54696d65737461" .
            "6d70122c0a08656e645f74696d6518022001280b321a2e676f6f676c652e" .
            "70726f746f6275662e54696d657374616d7042060a0474696d6522630a1f" .
            "53746172744d616e75616c5472616e7366657252756e73526573706f6e73" .
            "6512400a0472756e7318012003280b32322e676f6f676c652e636c6f7564" .
            "2e62696771756572792e646174617472616e736665722e76312e5472616e" .
            "7366657252756e32c31f0a13446174615472616e73666572536572766963" .
            "6512e6010a0d47657444617461536f75726365123b2e676f6f676c652e63" .
            "6c6f75642e62696771756572792e646174617472616e736665722e76312e" .
            "47657444617461536f75726365526571756573741a312e676f6f676c652e" .
            "636c6f75642e62696771756572792e646174617472616e736665722e7631" .
            "2e44617461536f75726365226582d3e4930258122f2f76312f7b6e616d65" .
            "3d70726f6a656374732f2a2f6c6f636174696f6e732f2a2f64617461536f" .
            "75726365732f2a7d5a2512232f76312f7b6e616d653d70726f6a65637473" .
            "2f2a2f64617461536f75726365732f2a7dda41046e616d6512f9010a0f4c" .
            "69737444617461536f7572636573123d2e676f6f676c652e636c6f75642e" .
            "62696771756572792e646174617472616e736665722e76312e4c69737444" .
            "617461536f7572636573526571756573741a3e2e676f6f676c652e636c6f" .
            "75642e62696771756572792e646174617472616e736665722e76312e4c69" .
            "737444617461536f7572636573526573706f6e7365226782d3e493025812" .
            "2f2f76312f7b706172656e743d70726f6a656374732f2a2f6c6f63617469" .
            "6f6e732f2a7d2f64617461536f75726365735a2512232f76312f7b706172" .
            "656e743d70726f6a656374732f2a7d2f64617461536f7572636573da4106" .
            "706172656e7412b6020a144372656174655472616e73666572436f6e6669" .
            "6712422e676f6f676c652e636c6f75642e62696771756572792e64617461" .
            "7472616e736665722e76312e4372656174655472616e73666572436f6e66" .
            "6967526571756573741a352e676f6f676c652e636c6f75642e6269677175" .
            "6572792e646174617472616e736665722e76312e5472616e73666572436f" .
            "6e66696722a20182d3e49302820122332f76312f7b706172656e743d7072" .
            "6f6a656374732f2a2f6c6f636174696f6e732f2a7d2f7472616e73666572" .
            "436f6e666967733a0f7472616e736665725f636f6e6669675a3a22272f76" .
            "312f7b706172656e743d70726f6a656374732f2a7d2f7472616e73666572" .
            "436f6e666967733a0f7472616e736665725f636f6e666967da4116706172" .
            "656e742c7472616e736665725f636f6e66696712db020a14557064617465" .
            "5472616e73666572436f6e66696712422e676f6f676c652e636c6f75642e" .
            "62696771756572792e646174617472616e736665722e76312e5570646174" .
            "655472616e73666572436f6e666967526571756573741a352e676f6f676c" .
            "652e636c6f75642e62696771756572792e646174617472616e736665722e" .
            "76312e5472616e73666572436f6e66696722c70182d3e49302a20132432f" .
            "76312f7b7472616e736665725f636f6e6669672e6e616d653d70726f6a65" .
            "6374732f2a2f6c6f636174696f6e732f2a2f7472616e73666572436f6e66" .
            "6967732f2a7d3a0f7472616e736665725f636f6e6669675a4a32372f7631" .
            "2f7b7472616e736665725f636f6e6669672e6e616d653d70726f6a656374" .
            "732f2a2f7472616e73666572436f6e666967732f2a7d3a0f7472616e7366" .
            "65725f636f6e666967da411b7472616e736665725f636f6e6669672c7570" .
            "646174655f6d61736b12e1010a1444656c6574655472616e73666572436f" .
            "6e66696712422e676f6f676c652e636c6f75642e62696771756572792e64" .
            "6174617472616e736665722e76312e44656c6574655472616e7366657243" .
            "6f6e666967526571756573741a162e676f6f676c652e70726f746f627566" .
            "2e456d707479226d82d3e49302602a332f76312f7b6e616d653d70726f6a" .
            "656374732f2a2f6c6f636174696f6e732f2a2f7472616e73666572436f6e" .
            "666967732f2a7d5a292a272f76312f7b6e616d653d70726f6a656374732f" .
            "2a2f7472616e73666572436f6e666967732f2a7dda41046e616d6512fa01" .
            "0a114765745472616e73666572436f6e666967123f2e676f6f676c652e63" .
            "6c6f75642e62696771756572792e646174617472616e736665722e76312e" .
            "4765745472616e73666572436f6e666967526571756573741a352e676f6f" .
            "676c652e636c6f75642e62696771756572792e646174617472616e736665" .
            "722e76312e5472616e73666572436f6e666967226d82d3e493026012332f" .
            "76312f7b6e616d653d70726f6a656374732f2a2f6c6f636174696f6e732f" .
            "2a2f7472616e73666572436f6e666967732f2a7d5a2912272f76312f7b6e" .
            "616d653d70726f6a656374732f2a2f7472616e73666572436f6e66696773" .
            "2f2a7dda41046e616d65128d020a134c6973745472616e73666572436f6e" .
            "6669677312412e676f6f676c652e636c6f75642e62696771756572792e64" .
            "6174617472616e736665722e76312e4c6973745472616e73666572436f6e" .
            "66696773526571756573741a422e676f6f676c652e636c6f75642e626967" .
            "71756572792e646174617472616e736665722e76312e4c6973745472616e" .
            "73666572436f6e66696773526573706f6e7365226f82d3e493026012332f" .
            "76312f7b706172656e743d70726f6a656374732f2a2f6c6f636174696f6e" .
            "732f2a7d2f7472616e73666572436f6e666967735a2912272f76312f7b70" .
            "6172656e743d70726f6a656374732f2a7d2f7472616e73666572436f6e66" .
            "696773da4106706172656e7412cd020a145363686564756c655472616e73" .
            "66657252756e7312422e676f6f676c652e636c6f75642e62696771756572" .
            "792e646174617472616e736665722e76312e5363686564756c655472616e" .
            "7366657252756e73526571756573741a432e676f6f676c652e636c6f7564" .
            "2e62696771756572792e646174617472616e736665722e76312e53636865" .
            "64756c655472616e7366657252756e73526573706f6e736522ab01880201" .
            "82d3e49302840122422f76312f7b706172656e743d70726f6a656374732f" .
            "2a2f6c6f636174696f6e732f2a2f7472616e73666572436f6e666967732f" .
            "2a7d3a7363686564756c6552756e733a012a5a3b22362f76312f7b706172" .
            "656e743d70726f6a656374732f2a2f7472616e73666572436f6e66696773" .
            "2f2a7d3a7363686564756c6552756e733a012ada411a706172656e742c73" .
            "746172745f74696d652c656e645f74696d6512bc020a1753746172744d61" .
            "6e75616c5472616e7366657252756e7312452e676f6f676c652e636c6f75" .
            "642e62696771756572792e646174617472616e736665722e76312e537461" .
            "72744d616e75616c5472616e7366657252756e73526571756573741a462e" .
            "676f6f676c652e636c6f75642e62696771756572792e646174617472616e" .
            "736665722e76312e53746172744d616e75616c5472616e7366657252756e" .
            "73526573706f6e736522910182d3e493028a0122452f76312f7b70617265" .
            "6e743d70726f6a656374732f2a2f6c6f636174696f6e732f2a2f7472616e" .
            "73666572436f6e666967732f2a7d3a73746172744d616e75616c52756e73" .
            "3a012a5a3e22392f76312f7b706172656e743d70726f6a656374732f2a2f" .
            "7472616e73666572436f6e666967732f2a7d3a73746172744d616e75616c" .
            "52756e733a012a12ff010a0e4765745472616e7366657252756e123c2e67" .
            "6f6f676c652e636c6f75642e62696771756572792e646174617472616e73" .
            "6665722e76312e4765745472616e7366657252756e526571756573741a32" .
            "2e676f6f676c652e636c6f75642e62696771756572792e64617461747261" .
            "6e736665722e76312e5472616e7366657252756e227b82d3e493026e123a" .
            "2f76312f7b6e616d653d70726f6a656374732f2a2f6c6f636174696f6e73" .
            "2f2a2f7472616e73666572436f6e666967732f2a2f72756e732f2a7d5a30" .
            "122e2f76312f7b6e616d653d70726f6a656374732f2a2f7472616e736665" .
            "72436f6e666967732f2a2f72756e732f2a7dda41046e616d6512e9010a11" .
            "44656c6574655472616e7366657252756e123f2e676f6f676c652e636c6f" .
            "75642e62696771756572792e646174617472616e736665722e76312e4465" .
            "6c6574655472616e7366657252756e526571756573741a162e676f6f676c" .
            "652e70726f746f6275662e456d707479227b82d3e493026e2a3a2f76312f" .
            "7b6e616d653d70726f6a656374732f2a2f6c6f636174696f6e732f2a2f74" .
            "72616e73666572436f6e666967732f2a2f72756e732f2a7d5a302a2e2f76" .
            "312f7b6e616d653d70726f6a656374732f2a2f7472616e73666572436f6e" .
            "666967732f2a2f72756e732f2a7dda41046e616d651292020a104c697374" .
            "5472616e7366657252756e73123e2e676f6f676c652e636c6f75642e6269" .
            "6771756572792e646174617472616e736665722e76312e4c697374547261" .
            "6e7366657252756e73526571756573741a3f2e676f6f676c652e636c6f75" .
            "642e62696771756572792e646174617472616e736665722e76312e4c6973" .
            "745472616e7366657252756e73526573706f6e7365227d82d3e493026e12" .
            "3a2f76312f7b706172656e743d70726f6a656374732f2a2f6c6f63617469" .
            "6f6e732f2a2f7472616e73666572436f6e666967732f2a7d2f72756e735a" .
            "30122e2f76312f7b706172656e743d70726f6a656374732f2a2f7472616e" .
            "73666572436f6e666967732f2a7d2f72756e73da4106706172656e7412b2" .
            "020a104c6973745472616e736665724c6f6773123e2e676f6f676c652e63" .
            "6c6f75642e62696771756572792e646174617472616e736665722e76312e" .
            "4c6973745472616e736665724c6f6773526571756573741a3f2e676f6f67" .
            "6c652e636c6f75642e62696771756572792e646174617472616e73666572" .
            "2e76312e4c6973745472616e736665724c6f6773526573706f6e7365229c" .
            "0182d3e493028c0112492f76312f7b706172656e743d70726f6a65637473" .
            "2f2a2f6c6f636174696f6e732f2a2f7472616e73666572436f6e66696773" .
            "2f2a2f72756e732f2a7d2f7472616e736665724c6f67735a3f123d2f7631" .
            "2f7b706172656e743d70726f6a656374732f2a2f7472616e73666572436f" .
            "6e666967732f2a2f72756e732f2a7d2f7472616e736665724c6f6773da41" .
            "06706172656e74129e020a0f436865636b56616c69644372656473123d2e" .
            "676f6f676c652e636c6f75642e62696771756572792e646174617472616e" .
            "736665722e76312e436865636b56616c6964437265647352657175657374" .
            "1a3e2e676f6f676c652e636c6f75642e62696771756572792e6461746174" .
            "72616e736665722e76312e436865636b56616c6964437265647352657370" .
            "6f6e7365228b0182d3e493027e223f2f76312f7b6e616d653d70726f6a65" .
            "6374732f2a2f6c6f636174696f6e732f2a2f64617461536f75726365732f" .
            "2a7d3a636865636b56616c696443726564733a012a5a3822332f76312f7b" .
            "6e616d653d70726f6a656374732f2a2f64617461536f75726365732f2a7d" .
            "3a636865636b56616c696443726564733a012ada41046e616d651a57ca41" .
            "236269677175657279646174617472616e736665722e676f6f676c656170" .
            "69732e636f6dd2412e68747470733a2f2f7777772e676f6f676c65617069" .
            "732e636f6d2f617574682f636c6f75642d706c6174666f726d42e3010a29" .
            "636f6d2e676f6f676c652e636c6f75642e62696771756572792e64617461" .
            "7472616e736665722e76314211446174615472616e7366657250726f746f" .
            "50015a51676f6f676c652e676f6c616e672e6f72672f67656e70726f746f" .
            "2f676f6f676c65617069732f636c6f75642f62696771756572792f646174" .
            "617472616e736665722f76313b646174617472616e73666572aa0225476f" .
            "6f676c652e436c6f75642e42696751756572792e446174615472616e7366" .
            "65722e5631ca0225476f6f676c655c436c6f75645c42696751756572795c" .
            "446174615472616e736665725c5631620670726f746f33"
        ), true);

        static::$is_initialized = true;
    }
}
