 val dfTags1 = sparkSession
      .read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv("src/resources/question_tags_10K.csv")


    val dfTags2 = sparkSession
      .read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv("src/resources/coldiff_input")
sparkSession.sparkContext.setLogLevel("ERROR")
    val columns2=dfTags2.schema.fields.toSeq
    val columns1=dfTags1.schema.fields.toSeq
    println(columns2.diff(columns1))
