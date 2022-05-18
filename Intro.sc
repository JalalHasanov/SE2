List(0, 1, 2, 3, 4).foldRight(List[String]())((x, list) => ("<" + x + ">") :: list)
