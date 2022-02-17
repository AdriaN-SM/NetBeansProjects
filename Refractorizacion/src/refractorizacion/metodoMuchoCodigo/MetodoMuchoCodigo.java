package refractorizacion.metodoMuchoCodigo;

/**
 * https://medium.com/@joshsaintjacque/whats-the-problem-with-long-methods-72203f516cdb
 * https://refactoring.guru/smells/long-method
 * https://blog.devgenius.io/code-smell-03-functions-are-too-long-accea7eb4ae9
 * https://makolyte.com/refactoring-the-long-method-code-smell/
 */
public class MetodoMuchoCodigo {

    public void UpdateQuality() {
        Item items[] = null;

        for (int i = 0; i < items.length; i++) {
            if (items[i].Name != AGED__BRIE && items[i].Name != BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT) {
                QualityGreater(items, i);
            } else {
                if (items[i].Quality < 50) {
                    items[i].Quality = items[i].Quality + 1;

                    if (items[i].Name == BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT) {
                        sellIn(items, i, 11);
                        sellIn(items, i, 6);
                    }
                }
            }

            Sulfuras(items, i);

            if (items[i].SellIn < 0) {
                if (items[i].Name != AGED__BRIE) {
                    if (items[i].Name != BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT) {
                        QualityGreater(items, i);
                    } else {
                        items[i].Quality = items[i].Quality - items[i].Quality;
                    }
                } else {
                    QualityMenor50(items, i);
                }
            }
        }
    }

    private void QualityMenor50(Item[] items, int i) {
        if (items[i].Quality < 50) {
            items[i].Quality = items[i].Quality + 1;
        }
    }

    private void Sulfuras(Item[] items, int i) {
        if (items[i].Name != "Sulfuras, Hand of Ragnaros") {
            items[i].SellIn = items[i].SellIn - 1;
        }
    }
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private static final String AGED__BRIE = "Aged Brie";

    private void sellIn(Item[] items, int i, int par) {
        if (items[i].SellIn < par) {
            QualityMenor50(items, i);
        }
    }

    private void QualityGreater(Item[] items, int i) {
        if (items[i].Quality > 0) {
            if (items[i].Name != "Sulfuras, Hand of Ragnaros") {
                items[i].Quality = items[i].Quality - 1;
            }
        }
    }

    private static class Item {

        private String Name;
        private int Quality;
        private int SellIn;

        public Item() {
        }
    }

}
