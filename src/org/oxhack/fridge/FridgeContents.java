package org.oxhack.fridge;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.content.Context;
import android.content.res.Resources;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


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

	/* now read every item from the file */
	BufferedReader reader = new BufferedReader(new InputStreamReader(
				getResources().openRawResource(R.raw.contents)
				));
	if (reader == null) {
		addrow(this, pricelist, "Error creating reader", "");
		return;
	}
	String line;
	try {
		while ((line = reader.readLine()) != null) {
			String lr[];
			lr = line.split(":",2);
			if (lr.length < 2) {
				continue;
			}
			
			addrow(this, pricelist, lr[0], lr[1]);
		}
		reader.close();
	}
	catch (IOException io) {
		addrow(this, pricelist, "Error reading rest of list", "");
	}

    }

}
