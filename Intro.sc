List(1, 2, 3, 4, 5, 6).foldRight(List[String]()) {
  (x, list) => ("<" + x + ">") :: list
}
