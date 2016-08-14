class AssertionsExample{
  static void main(String[] args){
    assert 1==1

    def arr = [1, 2, 3, 4, 5]
  //  assert (arr << 6) == [1, 2, 3, 4, 5]  //arr << 6 -- is the left shift operator. 6 will get inserted @ position 6

    assert 1 == 2 + 2 * 3 / 4

  }
}
