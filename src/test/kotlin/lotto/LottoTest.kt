package lotto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LottoTest {
    @Test
    fun `로또 번호의 개수가 6개가 넘어가면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Lotto(listOf(1, 2, 3, 4, 5, 6, 7))
        }
    }

    // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
    @Test
    fun `로또 번호에 중복된 숫자가 있으면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Lotto(listOf(1, 2, 3, 4, 5, 5))
        }
    }

    @Test
    fun `로또 번호 toString 테스트`() {
        val lotto = Lotto(listOf(1, 2, 3, 4, 5, 6))
        assertEquals(lotto.toString(), "[1, 2, 3, 4, 5, 6]")
    }

    @Test
    fun `로또 번호 정렬 테스트`() {
        val lotto = Lotto(listOf(6, 5, 4, 3, 2, 1))
        assertEquals(lotto.toString(), "[1, 2, 3, 4, 5, 6]")
    }

    @Test
    fun `로또번호 겹치는 개수 알아내기 테스트`() {
        val userLotto = Lotto(listOf(1, 2, 3, 4, 5, 6))
        val winLotto = Lotto(listOf(9, 10, 11, 3, 1, 2))
        assertEquals((userLotto intersect winLotto).size, 3)
    }
}
