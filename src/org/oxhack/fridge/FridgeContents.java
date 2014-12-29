package org.oxhack.fridge;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.content.Context;


public class FridgeContents extends Activity
{
	private void addrow(Context ct, TableLayout t, String namestring, String pricestring)
	{
	TableRow row = new TableRow(ct);

	TextView name = new TextView(ct);
	name.setText(namestring);
	name.setTextAppearance(ct,R.style.ListStyle);
	if (pricestring.isEmpty()) {
	/* centre the separators */
		name.setGravity(Gravity.CENTER_HORIZONTAL);
	}
	TextView price = new TextView(ct);
	price.setText(pricestring);
	price.setTextAppearance(ct,R.style.ListStyle);
	row.addView(name);
	row.addView(price);

	t.addView(row);
	}

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

	/* populate pricelist */
	/* find by id (only works after setContentView) */
	TableLayout pricelist = (TableLayout) findViewById(R.id.pricelist);

	pricelist.setColumnStretchable(0,true);
	/* TODO: read this list from file */

	addrow(this, pricelist, "Soft Drinks", "");
	addrow(this, pricelist, "Soft drink cans (not San Pelleg.)", "0.75");
	addrow(this, pricelist, "San Pellegrino soft drinks", "1.00");
	addrow(this, pricelist, "San Pellegrino sparkling water", "0.75");
	addrow(this, pricelist, "Bottled Coca-Cola", "1.00");
	addrow(this, pricelist, "Mojito soft drinks (750ml)", "2.00");
	addrow(this, pricelist, "Thai iced tea (canned)", "1.20");
	addrow(this, pricelist, "Foco Coconut juice (canned)", "1.20");
	addrow(this, pricelist, "J20 (bottles)", "1.00");
	addrow(this, pricelist, "Capri-Sun orange juice", "0.50");
	addrow(this, pricelist, "Fentimans drinks (bottles)", "1.75");
	addrow(this, pricelist, "Fever-Tree ginger beer (bottles)", "2.20");
	addrow(this, pricelist, "Fever-Tree tonic water (bottles)", "2.20");
	addrow(this, pricelist, "Highland Spring Still / Sparkling", "0.75");
	addrow(this, pricelist, "A&W Root Beer", "0.75");
	addrow(this, pricelist, "Energy drinks", "");
	addrow(this, pricelist, "Monster energy drinks (canned)", "1.50");
	addrow(this, pricelist, "Club Mate", "2.00");
	addrow(this, pricelist, "Lucozade sports drinks", "1.50");
	addrow(this, pricelist, "Red Bull (250ml)", "1.25");
	addrow(this, pricelist, "Alcoholic drinks", "");
	addrow(this, pricelist, "Real ale (bottled)", "2.50");
	addrow(this, pricelist, "Cider (bottled)", "2.50");
	addrow(this, pricelist, "Lagers", "1.50");
	addrow(this, pricelist, "Lagers (660ml to 1l)", "2.50");
	addrow(this, pricelist, "Wine", "7.00");
	addrow(this, pricelist, "Small wine (shiraz, 180ml)", "3.00");
	addrow(this, pricelist, "Bavaria Shandy", "0.75");
	addrow(this, pricelist, "Alcohol-free beer", "");
	addrow(this, pricelist, "Bavaria non-alcoholic beer", "0.75");
	addrow(this, pricelist, "Becks Blue non-alcoholic beer (275ml)", "0.75");
	addrow(this, pricelist, "Hopper softbrew (bottles)", "1.50");
	addrow(this, pricelist, "Food", "");
	addrow(this, pricelist, "Basic crisps", "0.40");
	addrow(this, pricelist, "Most chocolate bars", "0.75");
	addrow(this, pricelist, "Smarties", "0.75");
	addrow(this, pricelist, "Nestle Milkybar", "0.50");
	addrow(this, pricelist, "Small Milky Ways", "0.40");
	addrow(this, pricelist, "Starburst", "0.75");
	addrow(this, pricelist, "Skittles, 55g", "0.75");
	addrow(this, pricelist, "Baby Pringes", "0.75");
	addrow(this, pricelist, "Oreos", "0.75");
	addrow(this, pricelist, "Turkish Delight", "0.50");
	addrow(this, pricelist, "Puddings", "0.40");
	addrow(this, pricelist, "Alpro/Provamel soya puddings", "0.50");
	addrow(this, pricelist, "Nature Valley bars", "0.40");
	addrow(this, pricelist, "Nakd fruit bars", "1.00");
	addrow(this, pricelist, "Small fruit & nut bags", "0.40");
	addrow(this, pricelist, "Strawberry laces", "0.50");
	addrow(this, pricelist, "Gummy bears", "0.50");
	addrow(this, pricelist, "Chocolate orange", "3.50");
	addrow(this, pricelist, "Kinder Surprise eggs", "1.00");
	addrow(this, pricelist, "Ice cream on a stick", "0.50");
	addrow(this, pricelist, "Sainsbury's pizzas", "3.00");
	addrow(this, pricelist, "Soups (on top of the fridge)", "1.00");

    }

}
