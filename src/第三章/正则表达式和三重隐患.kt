package 第三章

/**
 * 日期 : 2020/10/20.
 * 创建 : xin.li
 * 描述 :
 */
fun main() {
    val url = "/Users/lixin/AndroidStudioProjects/shangri_la.keystore"
    val path = url.substringBeforeLast("/")
    val file = url.substringAfterLast("/")
    val fileName = file.substringBeforeLast(".")
    val fileExtension = file.substringAfterLast(".")
    println("文件在: $path 下, 叫$fileName , 是个$fileExtension 文件")


    val toRegex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchEntire = toRegex.matchEntire(url)
    if (matchEntire != null){
        val (path1 , fileName1 , fileExtension1) = matchEntire.destructured
        println("文件在: $path1 下, 叫$fileName1 , 是个$fileExtension1 文件")
    }

    val kotlinLogo = """
           .,:,,,                                        .::,,,::.
          .::::,,;;,                                  .,;;:,,....:i:
          :i,.::::,;i:.      ....,,:::::::::,....   .;i:,.  ......;i.
          :;..:::;::::i;,,:::;:,,,,,,,,,,..,.,,:::iri:. .,:irsr:,.;i.
          ;;..,::::;;;;ri,,,.                    ..,,:;s1s1ssrr;,.;r,
          :;. ,::;ii;:,     . ...................     .;iirri;;;,,;i,
          ,i. .;ri:.   ... ............................  .,,:;:,,,;i:
          :s,.;r:... ....................................... .::;::s;
          ,1r::. .............,,,.,,:,,........................,;iir;
          ,s;...........     ..::.,;:,,.          ...............,;1s
         :i,..,.              .,:,,::,.          .......... .......;1,
        ir,....:rrssr;:,       ,,.,::.     .r5S9989398G95hr;. ....,.:s,
       ;r,..,s9855513XHAG3i   .,,,,,,,.  ,S931,.,,.;s;s&BHHA8s.,..,..:r:
      :r;..rGGh,  :SAG;;G@BS:.,,,,,,,,,.r83:      hHH1sXMBHHHM3..,,,,.ir.
     ,si,.1GS,   sBMAAX&MBMB5,,,,,,:,,.:&8       3@HXHBMBHBBH#X,.,,,,,,rr
     ;1:,,SH:   .A@&&B#&8H#BS,,,,,,,,,.,5XS,     3@MHABM&59M#As..,,,,:,is,
    .rr,,,;9&1   hBHHBB&8AMGr,,,,,,,,,,,:h&&9s;   r9&BMHBHMB9:  . .,,,,;ri.
    :1:....:5&XSi;r8BMBHHA9r:,......,,,,:ii19GG88899XHHH&GSr.      ...,:rs.
    ;s.     .:sS8G8GG889hi.        ....,,:;:,.:irssrriii:,.        ...,,i1,
    ;1,         ..,....,,isssi;,        .,,.                      ....,.i1,
    ;h:               i9HHBMBBHAX9:         .                     ...,,,rs,
    ,1i..            :A#MBBBBMHB##s                             ....,,,;si.
    .r1,..        ,..;3BMBBBHBB#Bh.     ..                    ....,,,,,i1;
     :h;..       .,..;,1XBMMMMBXs,.,, .. :: ,.               ....,,,,,,ss.
      ih: ..    .;;;, ;;:s58A3i,..    ,. ,.:,,.             ...,,,,,:,s1,
      .s1,....   .,;sh,  ,iSAXs;.    ,.  ,,.i85            ...,,,,,,:i1;
       .rh: ...     rXG9XBBM#M#MHAX3hss13&&HHXr         .....,,,,,,,ih;
        .s5: .....    i598X&&A&AAAAAA&XG851r:       ........,,,,:,,sh;
         . ihr, ...  .         ..                    ........,,,,,;11:.
           ,s1i. ...  ..,,,..,,,.,,.,,.,..       ........,,.,,.;s5i.
            .:s1r,......................       ..............;shs,
            . .:shr:.  ....                 ..............,ishs.
                .,issr;,... ...........................,is1s;.
                   .,is1si;:,....................,:;ir1sr;,
                      ..:isssssrrii;::::::;;iirsssssr;:..
                           .,::iiirsssssssssrri;;:.
                           """
    println(kotlinLogo)

    println("""${'$'}99.9""")
}