val dfTags1 = sparkSession
      .read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv("src/resources/question_tags_10K.csv")

val cols=dfTags1.schema.toList.filter(x=>x.dataType ==IntegerType).map(c =>col(c.name))
    dfTags1.select(cols:_*).show()
