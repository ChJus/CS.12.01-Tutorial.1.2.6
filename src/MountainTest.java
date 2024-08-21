import static org.junit.jupiter.api.Assertions.*;

class MountainTest {
  @org.junit.jupiter.api.BeforeEach
  void setUp() {
  }

  @org.junit.jupiter.api.AfterEach
  void tearDown() {
  }

  @org.junit.jupiter.api.Test
  void isIncreasing() {
    assertTrue(Mountain.isIncreasing(new int[]{1, 2, 3, 4, 5}, 4));
    assertTrue(Mountain.isIncreasing(new int[]{1, 2, 3, 4, 2}, 3));

    assertFalse(Mountain.isIncreasing(new int[]{1, 3, 3, 4, 5}, 4));
  }

  @org.junit.jupiter.api.Test
  void isDecreasing() {
    assertTrue(Mountain.isDecreasing(new int[]{1, 2, 3, 2, 1}, 2));
    assertTrue(Mountain.isDecreasing(new int[]{5, 4, 3, 2, 0}, 0));

    assertFalse(Mountain.isDecreasing(new int[]{5, 4, 4, 3, 2}, 0));
  }

  @org.junit.jupiter.api.Test
  void getPeakIndex() {
    assertEquals(2, Mountain.getPeakIndex(new int[]{11, 22, 33, 22, 11}));
    assertEquals(1, Mountain.getPeakIndex(new int[]{11, 22, 11, 22, 11}));
    assertEquals(-1, Mountain.getPeakIndex(new int[]{11, 22, 33, 55, 77}));
    assertEquals(-1, Mountain.getPeakIndex(new int[]{99, 33, 55, 77, 120}));
    assertEquals(3, Mountain.getPeakIndex(new int[]{99, 33, 55, 77, 55}));
    assertEquals(-1, Mountain.getPeakIndex(new int[]{33, 22, 11}));
  }

  @org.junit.jupiter.api.Test
  void isMountain() {
    assertTrue(Mountain.isMountain(new int[]{1, 2, 3, 2, 1}));
    assertTrue(Mountain.isMountain(new int[]{1, 4, 2, 1, 0}));

    assertFalse(Mountain.isMountain(new int[]{1, 2, 1, 2, 1}));
    assertFalse(Mountain.isMountain(new int[]{1, 2, 3, 1, 5}));
    assertFalse(Mountain.isMountain(new int[]{9, 3, 5, 7, 5}));
    assertFalse(Mountain.isMountain(new int[]{3, 2, 1}));
  }
}