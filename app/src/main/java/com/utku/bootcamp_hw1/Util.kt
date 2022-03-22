package com.utku.bootcamp_hw1

import java.text.DecimalFormat

object Util {
    var product: Product? =null
    fun getProductCategoryList(): ArrayList<ProductCategory> {
        return arrayListOf(
            ProductCategory("Su", 0),
            ProductCategory("Gazlı İçecek", 1),
            ProductCategory("Meyve Suyu", 2),
            ProductCategory("Süt Ürünleri", 3),
            ProductCategory("Enerji İçeceği", 4),
            ProductCategory("Maden Suyu", 5)
        )
    }
    fun toDecimalFormat(float: Float): String? {
        val df = DecimalFormat("#.##")
        val roundoff = df.format(float)
            return roundoff
    }

    fun getProductList(categoryId: Int): ArrayList<Product> {
        val productList = arrayListOf(
            Product("drawable/su", "Erikli", "Su 0.5 litre", 1.99f,"Doğal Kaynak Suyu 0.5 Litre", ProductCategory("Su", 0)),
            Product("drawable/su", "Saka", "Su 0.5 litre", 1.49f,"Doğal Kaynak Suyu 0.5 Litre", ProductCategory("Su", 0)),
            Product("drawable/su", "Sırma", "Su 0.5 litre", 1f,"Doğal Kaynak Suyu 0.5 Litre", ProductCategory("Su", 0)),
            Product("drawable/su", "Uludağ", "Su 1.5 litre", 2.88f, "Doğal Kaynak Suyu 1.5 Litre",ProductCategory("Su", 0)),
            Product("drawable/su", "Hamidiye", "Su 1 litre", 1.9f,"Doğal Kaynak Suyu 1 Litre", ProductCategory("Su", 0)),
            Product("drawable/su", "Kalabak", "Su 0.5 litre", 1.75f,"Doğal Kaynak Suyu 0.5 Litre", ProductCategory("Su", 0)),
            Product("drawable/su", "Abant", "Su 0.33 litre", 1.25f, "Doğal Kaynak Suyu 0.33 Litre",ProductCategory("Su", 0)),
            Product(
                "drawable/kola",
                "Coca Cola",
                "Kola 0.33 litre",
                5f,"Coca Cola kutu kola 0.33 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/kola",
                "Coca Cola",
                "Kola 1 litre",
                6.25f,"Coca Cola şişe kola 1 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/kola",
                "Coca Cola",
                "Kola 2.5 litre",
                12.25f,"Coca Cola şişe kola 2.5 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/fanta",
                "Fanta",
                "Portakallı Gazoz 1 litre",
                6.25f,
                "Fanta portakallı gazoz şişe 1 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/fanta",
                "Fanta",
                "Portakallı Gazoz 0.33 litre",
                4.25f,"Fanta portakallı gazoz kutu 0.33 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/fanta",
                "Fanta",
                "Portakallı 2.5 litre",
                11.25f,"Fanta portakallı gazoz şişe 2.5 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/sprite",
                "Sprite",
                "Gazoz 1 litre",
                6.25f,"Sprite limon aromalı gazoz şişe 2.5 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/sprite",
                "Sprite",
                "Gazoz 0.33 litre",
                4.25f,
                "Sprite limon aromalı gazoz kutu 0.33 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/kola",
                "Pepsi",
                "Kola 1 litre",
                6.25f,
                "Pepsi kola pet şişe 1 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/fanta",
                "Schwepps",
                "Portakallı Gazoz 2 litre",
                12.25f,"Schwepps mandalina limon aromalı gazoz şişe 1 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/sprite",
                "Fruko",
                "Kola 1 litre",
                6.25f,"Fruko limon aromalı gazoz şişe 1 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/sprite",
                "Fruko",
                "Kola 2 litre",
                9.25f,"Fruko limon aromalı gazoz şişe 2 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/sprite",
                "Fruko",
                "Kola 0.33 litre",
                3.25f,"Fruko limon aromalı gazoz kutu 0.33 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/fanta",
                "Yedigün",
                "Mandalinalı Gazoz 1 litre",
                6.25f,"Yedigün mandalina aromalı gazoz şişe 1 litre",
                ProductCategory("Gazlı İçecek", 1)
            ),
            Product(
                "drawable/meyve",
                "Cappy",
                "Vişne Meyve Suyu 1 litre",
                6.25f,"%100 Doğal vişne suyu 1 litre karton kutu ",
                ProductCategory("Meyve Suyu", 2)
            ),
            Product(
                "drawable/meyve",
                "Cappy",
                "Kayısı Meyve Suyu  1 litre",
                6.25f,"%100 Doğal kayısı suyu 1 litre karton kutu ",
                ProductCategory("Meyve Suyu", 2)
            ),
            Product(
                "drawable/meyve",
                "Pınar",
                "Portakal Suyu 1 litre",
                14.25f,"%100 Doğal portakal suyu 1 litre karton kutu ",
                ProductCategory("Meyve Suyu", 2)
            ),
            Product(
                "drawable/meyve",
                "Dimes",
                "Nar Suyu 1 litre",
                7.25f,"%100 Doğal nar suyu 1 litre karton kutu ",
                ProductCategory("Meyve Suyu", 2)
            ),
            Product(
                "drawable/meyve",
                "Cappy",
                "Mandalina Suyu litre",
                16.25f,"%100 Doğal mandalina suyu 1 litre karton kutu ",
                ProductCategory("Meyve Suyu", 2)
            ),
            Product(
                "drawable/sut",
                "Pınar",
                "Tam Yağlı Süt 1 litre",
                16.25f,"Organik tam yağlı inek sütü 1 litre karton kutu ",
                ProductCategory("Süt Ürünleri", 3)
            ),
            Product(
                "drawable/sut",
                "Pınar",
                "Yarım Yağlı Süt 1 litre",
                13.25f,"Organik yarım yağlı inek sütü 1 litre karton kutu ",
                ProductCategory("Süt Ürünleri", 3)
            ),
            Product(
                "drawable/sut",
                "Pınar",
                "Yağlı Süt 200ml",
                6.25f,"Organik tam yağlı inek sütü 200ml karton kutu ",
                ProductCategory("Süt Ürünleri", 3)
            ),
            Product(
                "drawable/sut",
                "Sütaş",
                "Laktozsuz Süt 1 litre",
                19.25f,"Organik tam yağlı laktozsuz inek sütü 1 litre karton kutu ",
                ProductCategory("Süt Ürünleri", 3)
            ),
            Product(
                "drawable/ayran",
                "Sütaş",
                "Ayran 1 litre",
                11.75f,"Organik tam yağlı yayık ayran 1 litre pet şişe",
                ProductCategory("Süt Ürünleri", 3)
            ),
            Product(
                "drawable/ayran",
                "Sütaş",
                "Ayran 200ml",
                3.25f,"Organik tam yağlı yayık ayran 200ml litre pet bardak",
                ProductCategory("Süt Ürünleri", 3)
            ),
            Product(
                "drawable/ayran",
                "İçim",
                "Ayran 2 litre",
                18.25f,"Organik tam yağlı yayık ayran 2 litre pet şişe",
                ProductCategory("Süt Ürünleri", 3)
            ),
            Product(
                "drawable/redbull",
                "Redbull",
                "Redbull 1 litre",
                26.25f,"Redbull enerji içeceği 1 litre cam şişe",
                ProductCategory("Enerji İçeceği", 4)
            ),
            Product(
                "drawable/redbull",
                "Redbull",
                "Redbull Hindistan Cevizli 0.33ml",
                8f,"Redbull enerji içeceği hindistan cevizi aromalı 0.33ml teneke kutu",
                ProductCategory("Enerji İçeceği", 4)
            ),
            Product(
                "drawable/redbull",
                "Redbull",
                "Redbull Şekersiz 0.33ml",
                11.25f,"Redbull enerji içeceği şekersiz 0.33ml teneke kutu",
                ProductCategory("Enerji İçeceği", 4)
            ),
            Product(
                "drawable/redbull",
                "Redbull",
                "Redbull 0.75ml",
                14.25f,"Redbull enerji içeceği  0.75ml teneke kutu",
                ProductCategory("Enerji İçeceği", 4)
            ),
            Product(
                "drawable/redbull",
                "Redbull",
                "Redbull 2 litre",
                36.25f,"Redbull enerji içeceği şekersiz 2 litre pet şişe",
                ProductCategory("Enerji İçeceği", 4)
            ),
            Product(
                "drawable/madensuyu",
                "Uludağ",
                "200ml 6lı maden suyu",
                6.25f,"Uludağ doğal minarelli katkısız maden suyu",
                ProductCategory("Maden Suyu", 5)
            ),
            Product(
                "drawable/madensuyu",
                "Beypazarı",
                "200ml şişe maden suyu",
                2.25f,"Beypazarı doğal minarelli katkısız maden suyu",
                ProductCategory("Maden Suyu", 5)
            ),
            Product(
                "drawable/madensuyu",
                "Beypazarı",
                "200ml şişe 12li maden suyu",
                20.25f,"Beypazarı doğal minarelli katkısız maden suyu 12li koli",
                ProductCategory("Maden Suyu", 5)
            ),
            Product(
                "drawable/madensuyu",
                "Beypazarı",
                "200ml şişe 24lü maden suyu",
                35f,"Beypazarı doğal minarelli katkısız maden suyu 24lü koli",
                ProductCategory("Maden Suyu", 5)
            ),
            Product(
                "drawable/madensuyu",
                "Kınık",
                "200ml şişe maden suyu",
                2f,"Kınık doğal minarelli katkısız maden suyu",
                ProductCategory("Maden Suyu", 5)
            ),
            Product(
                "drawable/madensuyu",
                "Kınık",
                "200ml şişe 12li maden suyu",
                16.75f,"Kınık doğal minarelli katkısız maden suyu 12li koli",
                ProductCategory("Maden Suyu", 5)
            )
        )
        return productList.filter { it.productCategory.categoryId == categoryId } as ArrayList<Product>
    }


}